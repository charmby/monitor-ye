#!/usr/bin/env bash

source ../../../common_script/funcs.sh

addr=$(getClusterAddr)
source ../$addr/common.sh

docker build -t "$IMAGEURL_PRODUCER" .
docker push $IMAGEURL_PRODUCER
