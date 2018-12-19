#!/usr/bin/env bash

java -Xms512m -Xmx1500m -cp /opt/enn-monitor-log-storage-origin-es.jar enn.monitor.log.storage.origin.es.server.EnnMonitorLogStorageOriginESServer --workthread_num 8 --kafkaUrl "10.19.248.26:29420,10.19.248.27:29421,10.19.248.28:29422,10.19.248.29:29423,10.19.248.30:29424" --topic_origin "monitor-log-origin" --group_id "prod-log-micklongen" --es_host "elasticsearch-client.monitor-essential-service:9300" --es_cluster "es-log" --token "01C561B348479ECC66EB6D6C85C026C0" --enable_metrics --gatewayHost "10.19.248.200" --gatewayPort 30111 --queue_size 500000
