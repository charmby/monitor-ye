nohup etcd --name master --initial-advertise-peer-urls http://10.19.132.167:2380 --listen-peer-urls http://10.19.132.167:2380 --listen-client-urls http://127.0.0.1:2379,http://10.19.132.167:2379 --advertise-client-urls http://127.0.0.1:2379,http://10.19.132.167:2379 --initial-cluster master=http://10.19.132.167:2380 --initial-cluster-state new &
