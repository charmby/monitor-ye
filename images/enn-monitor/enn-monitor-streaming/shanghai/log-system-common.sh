#!/usr/bin/env bash

CPU_LIMIT_LOG_SYSTEM=1
MEM_LIMIT_LOG_SYSTEM=3Gi
CPU_REQ_LOG_SYSTEM=500m
MEM_REQ_LOG_SYSTEM=2Gi

IMAGEURL=10.19.140.200:29006/enncloud/monitor-streaming-jobs:0.9.0.release

CEPH_PATH=/opt/ceph
WORKSPACE=/opt/workspace
JOB_JAR=enn-monitor-log-streaming-0.10.0-SNAPSHOT.jar
JOB_SH=start-etl-log-system_1.sh
SPARK_MASTER=spark://pre2-master1.monitor-essential-service:7077,pre2-master2.monitor-essential-service:7077,pre2-master3.monitor-essential-service:7077
MAIN_CLASS=enn.monitor.log.streaming.Collector
TOTAL_CORES=3
EXECUTOR_MEM=2g
EXECUTOR_CORES=1
MAX_RATE=10000
KAFKA=pre2-kafka1.monitor-essential-service:9092,pre2-kafka2.monitor-essential-service:9092,pre2-kafka3.monitor-essential-service:9092
PROM_PUSH="off"
ES_URL=elasticsearch-client.monitor-essential-service:9300
RECEIVER_COUNT=1
TOPIC_NAME=log-k8s-system
ASYNC="off"
GROUP_ID=etl-log-system
ES_BATCH=1000
RDD_PARTITION=0
SPARK_BATCH=5
#PROM_PUSH=prometheus-pushprom.monitor-system-alert:27094