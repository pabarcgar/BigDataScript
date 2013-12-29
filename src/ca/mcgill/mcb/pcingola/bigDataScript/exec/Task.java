package ca.mcgill.mcb.pcingola.bigDataScript.exec;

import java.io.File;
import java.util.List;

import ca.mcgill.mcb.pcingola.bigDataScript.cluster.host.HostResources;
import ca.mcgill.mcb.pcingola.bigDataScript.serialize.BigDataScriptSerialize;
import ca.mcgill.mcb.pcingola.bigDataScript.serialize.BigDataScriptSerializer;
import ca.mcgill.mcb.pcingola.bigDataScript.util.Gpr;
import ca.mcgill.mcb.pcingola.bigDataScript.util.Timer;

/**
 * A task to be executed by an Executioner
 * 
 * @author pcingola
 */
public class Task implements BigDataScriptSerialize {

	public enum TaskState {
		NONE // Task created, nothing happened so far
		, STARTED // Process started (or queued for execution)
		, START_FAILED // Process failed to start (or failed to queue)
		, RUNNING // Running OK
		, ERROR // Filed while running
		, ERROR_TIMEOUT // Filed due to timeout
		, KILLED // Task was killed  
		, FINISHED // Finished OK  
	}

	// TODO: This should be a variable (SHEBANG?)
	public static final String SHE_BANG = "#!/bin/sh -e\n\n"; // Use '-e' so that shell script stops after first error

	// Exit codes (see bds.go)
	public static final int EXITCODE_OK = 0;
	public static final int EXITCODE_ERROR = 1;
	public static final int EXITCODE_TIMEOUT = 2;

	protected boolean verbose, debug;
	protected boolean canFail; // Allow execution to fail
	protected int bdsLineNum; // Program's line number that created this task (used for reporting errors)
	protected int exitValue; // Exit (error) code
	protected String id; // Task ID
	protected String bdsFileName; // Program file that created this task (used for reporting errors)
	protected String pid; // PID (if any)
	protected String programFileName; // Program file name
	protected String programTxt; // Program's text (program's code)
	protected String node; // Preferred execution node (or hostname)
	protected String queue; // Preferred execution queue
	protected String stdoutFile, stderrFile, exitCodeFile; // STDOUT, STDERR & exit code Files
	protected TaskState taskState;
	protected HostResources resources; // Resources to be consumes when executing this task
	protected List<String> outputFiles; // Output files generated by this task. TODO Serialize this!
	protected Boolean checkOutputFiles;

	public Task() {
		resources = new HostResources();
		reset();
	}

	public Task(String id, String programFileName, String programTxt, String bdsFileName, int bdsLineNum) {
		this.id = id;
		this.programFileName = programFileName;
		this.programTxt = programTxt;
		this.bdsFileName = bdsFileName;
		this.bdsLineNum = bdsLineNum;
		resources = new HostResources();
		reset();
	}

	/**
	 * Check if output files are OK
	 * @return true if OK, false there is an error (output file does not exist or has zero length)
	 */
	protected boolean checkOutputFiles() {
		if (checkOutputFiles != null) return checkOutputFiles;
		if (!isStateFinished() || outputFiles == null) return true; // Nothing to check

		boolean check = true;
		for (String fileName : outputFiles) {
			File file = new File(fileName);

			if (!file.exists()) {
				if (verbose) Timer.showStdErr("Error: Task " + id + " failed. Output file '" + fileName + "' does not exist");
				check = false;
			} else if (file.length() <= 0) {
				if (verbose) Timer.showStdErr("Error: Task " + id + " failed. Output file '" + fileName + "' has zero length");
				check = false;
			}
		}

		checkOutputFiles = check; // Cache result, don't check each file again
		return checkOutputFiles;
	}

	/**
	 * Create a program file
	 */
	public void createProgramFile() {
		Gpr.toFile(programFileName, SHE_BANG + programTxt);
		(new File(programFileName)).setExecutable(true); // Allow execution onf this file

		// Set default file names
		String base = Gpr.removeExt(programFileName);
		if (stdoutFile == null) stdoutFile = base + ".stdout";
		if (stderrFile == null) stderrFile = base + ".stderr";
		if (exitCodeFile == null) exitCodeFile = base + ".exitCode";
	}

	/**
	 * Remove tmp files on exit
	 */
	public void deleteOnExit() {
		if (stdoutFile != null) (new File(stdoutFile)).deleteOnExit();
		if (stderrFile != null) (new File(stderrFile)).deleteOnExit();
		if (exitCodeFile != null) (new File(exitCodeFile)).deleteOnExit();
		if (programFileName != null) (new File(programFileName)).deleteOnExit();
	}

	public String getBdsFileName() {
		return bdsFileName;
	}

	public int getBdsLineNum() {
		return bdsLineNum;
	}

	public String getExitCodeFile() {
		return exitCodeFile;
	}

	public synchronized int getExitValue() {
		if (!checkOutputFiles()) return 1; // Any output file failed?
		return exitValue;
	}

	public String getId() {
		return id;
	}

	public String getNode() {
		return node;
	}

	public synchronized String getPid() {
		return pid;
	}

	public String getProgramFileName() {
		return programFileName;
	}

	public String getQueue() {
		return queue;
	}

	public HostResources getResources() {
		return resources;
	}

	public String getStderrFile() {
		return stderrFile;
	}

	public String getStdoutFile() {
		return stdoutFile;
	}

	public boolean isCanFail() {
		return canFail;
	}

	/**
	 * Has this task finished? Either finished OK or finished because of errors.
	 * @return
	 */
	public synchronized boolean isDone() {
		return isError() || isStateFinished();
	}

	/**
	 * Has this task been executed successfully?
	 * The task has finished, exit code is zero and all output files have been created
	 * 
	 * @return
	 */
	public synchronized boolean isDoneOk() {
		return isStateFinished() && (exitValue == 0) && checkOutputFiles();
	}

	/**
	 * Is this task in any error or killed state?
	 * @return
	 */
	public synchronized boolean isError() {
		return (taskState == TaskState.START_FAILED) //
				|| (taskState == TaskState.ERROR) //
				|| (taskState == TaskState.ERROR_TIMEOUT) //
				|| (taskState == TaskState.KILLED) //
		;
	}

	/**
	 * Has this task been executed and failed?
	 * 
	 * This is true if:
	 * 		- The task has finished execution and it is in an error state 
	 * 		- OR exitValue is non-zero 
	 * 		- OR any of the output files was not created
	 * 
	 * @return
	 */
	public synchronized boolean isFailed() {
		return isError() || (exitValue != 0) || !checkOutputFiles();
	}

	/**
	 * Has the task been started?
	 * @return
	 */
	public synchronized boolean isStarted() {
		return taskState != TaskState.NONE;
	}

	public synchronized boolean isStateFinished() {
		return taskState == TaskState.FINISHED;
	}

	public synchronized boolean isStateRunning() {
		return taskState == TaskState.RUNNING;
	}

	public synchronized boolean isStateStarted() {
		return taskState == TaskState.STARTED;
	}

	/**
	 * Reset parameters and allow a task to be re-executed
	 */
	public void reset() {
		taskState = TaskState.NONE;
		exitValue = 0;
		outputFiles = null;
	}

	@Override
	public void serializeParse(BigDataScriptSerializer serializer) {
		// Note that "Task classname" field has been consumed at this point
		id = serializer.getNextField();
		canFail = serializer.getNextFieldBool();
		taskState = TaskState.valueOf(serializer.getNextFieldString());
		exitValue = (int) serializer.getNextFieldInt();
		node = serializer.getNextField();
		queue = serializer.getNextField();
		programFileName = serializer.getNextFieldString();
		programTxt = serializer.getNextFieldString();
		stdoutFile = serializer.getNextFieldString();
		stderrFile = serializer.getNextFieldString();
		exitCodeFile = serializer.getNextFieldString();

		resources = new HostResources();
		resources.serializeParse(serializer);
	}

	@Override
	public String serializeSave(BigDataScriptSerializer serializer) {
		return getClass().getSimpleName() //
				+ "\t" + id // 
				+ "\t" + canFail // 
				+ "\t" + taskState // 
				+ "\t" + exitValue // 
				+ "\t" + node // 
				+ "\t" + queue // 
				+ "\t" + serializer.serializeSaveValue(programFileName) //
				+ "\t" + serializer.serializeSaveValue(programTxt) //
				+ "\t" + serializer.serializeSaveValue(stdoutFile) //
				+ "\t" + serializer.serializeSaveValue(stderrFile) //
				+ "\t" + serializer.serializeSaveValue(exitCodeFile) //
				+ "\t" + resources.serializeSave(serializer) //
				+ "\n";
	}

	public void setCanFail(boolean canFail) {
		this.canFail = canFail;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	/**
	 * Set program's exit value and update state accordingly
	 * @param exitValue
	 */
	public synchronized void setExitValue(int exitValue) {
		this.exitValue = exitValue;
		if (exitValue == EXITCODE_OK) taskState = TaskState.FINISHED;
		else if (exitValue == EXITCODE_TIMEOUT) taskState = TaskState.ERROR_TIMEOUT;
		else taskState = TaskState.ERROR;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public void setOutputFiles(List<String> outputFiles) {
		this.outputFiles = outputFiles;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public void setQueue(String queue) {
		this.queue = queue;
	}

	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	protected synchronized void state(TaskState taskState) {
		this.taskState = taskState;
	}

	/**
	 * Change state to ERROR or START_FAILED
	 */
	public synchronized void stateError() {
		if (!isStarted()) taskState = TaskState.START_FAILED;
		else taskState = TaskState.ERROR;
	}

	/**
	 * Change state to FINISHED
	 */
	public synchronized void stateFinished() {
		taskState = TaskState.FINISHED;
	}

	/**
	 * Change state to FINISHED
	 */
	public synchronized void stateKilled() {
		taskState = TaskState.KILLED;
		exitValue = -1;
	}

	public synchronized void stateRunning() {
		taskState = TaskState.RUNNING;
	}

	/**
	 * Change state to STARTED
	 */
	public synchronized void stateStarted() {
		taskState = TaskState.STARTED;
	}

	@Override
	public String toString() {
		return toString(verbose);
	}

	public String toString(boolean verbose) {
		StringBuilder sb = new StringBuilder();

		if (verbose) {
			sb.append("\tProgram & line   : '" + bdsFileName + "', line " + bdsLineNum + "\n");
			sb.append("\tTask ID          : '" + id + "'\n");
			sb.append("\tTask state       : '" + taskState + "'\n");
			sb.append("\tScript file      : '" + programFileName + "'\n");
			sb.append("\tExit status      : '" + exitValue + "'\n");
			sb.append("\tStdErr (10 lines):\n" + Gpr.prependEachLine("\t\t", TailFile.tail(stderrFile)));
			sb.append("\tStdOut (10 lines):\n" + Gpr.prependEachLine("\t\t", TailFile.tail(stdoutFile)));

			if (debug) {
				sb.append("\tTask raw code:\n");
				sb.append("-------------------- Task code: Start --------------------\n");
				sb.append(programTxt + "\n");
				sb.append("-------------------- Task code: End   --------------------\n");
			}
		} else sb.append("'" + bdsFileName + "', line " + bdsLineNum);

		return sb.toString();
	}

}
