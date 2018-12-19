#!/usr/bin/env bash

IMAGEURL=10.19.248.12:29006/enncloud/enn-monitor-security-gateway-server:0.10.0.RELEASE
NUM=3

KAFKAURL=10.19.248.32:29420,10.19.248.33:29421,10.19.248.34:29422,10.19.248.14:29423,10.19.248.15:29424

LISTENPORT=10000
NODEPORT=30111

CPUREQ="1000m"
CPULIMIT="3000m"

MEMREQ="2Gi"
MEMLIMIT="4Gi"
