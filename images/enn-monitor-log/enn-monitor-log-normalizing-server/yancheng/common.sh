#!/usr/bin/env bash

IMAGEURL=10.19.248.12:29006/enncloud/enn-monitor-log-normalizing-server:0.10.2-RELEASE
NUM=3

KAFKAURL=10.19.248.26:29420,10.19.248.27:29421,10.19.248.28:29422,10.19.248.29:29423,10.19.248.30:29424

CONFIGIP=10.19.248.200
CONFIGPORT=29415

LISTENPORT=10000
EXTERNPORT=29521

CPUREQ="500m"
CPULIMIT="3000m"

MEMREQ="1G"
MEMLIMIT="2G"
