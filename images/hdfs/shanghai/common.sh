#!/usr/bin/env bash

HDFSMASTER1=10.19.137.141
HDFSMASTER2=10.19.137.141
HDFSDATA=(10.19.137.141 10.19.137.142 10.19.137.143)

HDFSMASTER1URL=127.0.0.1:29006/library/ha-namenode:1.1
HDFSMASTER2URL=127.0.0.1:29006/library/ha-standby:1.1

HDFSDATAURL=127.0.0.1:29006/library/ha-datanode

HDFSEXIP="10.19.137.141"