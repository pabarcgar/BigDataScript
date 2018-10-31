# This is a multistage build. This first stage is bases in an base image containing GO language and will compile BigDataScript
FROM golang:1.11-alpine3.8 as bigdatascript-installer

# Add JDK 8
RUN apk update
RUN apk add openjdk8

# install ANT
ENV HOME="/root"
WORKDIR $HOME
RUN wget http://apache.mirror.anlx.net//ant/binaries/apache-ant-1.10.5-bin.tar.gz
RUN tar -xzf apache-ant-1.10.5-bin.tar.gz
ENV PATH="$HOME/apache-ant-1.10.5/bin:${PATH}"

# Execute bigDataScript script installer
WORKDIR $HOME/BigDataScript
ADD . .
RUN ./scripts/install.sh

# This is the second stage. The base image just need JRE, bash and the resulting $HOME/.bds directory from the first stage
FROM openjdk:8-jre-alpine
RUN apk update
RUN apk add bash
ENV HOME="/root"
WORKDIR $HOME
COPY --from=bigdatascript-installer $HOME/.bds .bds
ENV PATH="$HOME/.bds:${PATH}"
