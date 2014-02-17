package ca.mcgill.mcb.pcingola.bigDataScript.executioner;

import ca.mcgill.mcb.pcingola.bigDataScript.Config;

/**
 * Execute tasks in a MOAB cluster.
 * 
 * All commands are run using 'qsub' (or equivalent) commands
 * 
 * @author pcingola
 */
public class ExecutionerClusterPbs extends ExecutionerCluster {

	public ExecutionerClusterPbs(Config config) {
		super(config);

		// Define commands
		String execCommand[] = { FAKE_CLUSTER + "msub" };
		String killCommand[] = { FAKE_CLUSTER + "canceljob" };
		String statCommand[] = { FAKE_CLUSTER + "showq" };
		String postMortemInfoCommand[] = { FAKE_CLUSTER + "checkjob" };

		clusterExecCommand = execCommand;
		clusterKillCommand = killCommand;
		clusterStatCommand = statCommand;
		clusterPostMortemInfoCommand = postMortemInfoCommand;

	}

	@Override
	protected CheckTasksRunning getCheckTasksRunning() {
		if (checkTasksRunning == null) checkTasksRunning = new CheckTasksRunningCluster(this, clusterStatCommand);
		return checkTasksRunning;
	}

}