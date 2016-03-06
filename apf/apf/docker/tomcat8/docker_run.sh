#!/bin/sh

daemon_mode='-d'
temp_mode='--rm'
docker_run_mode="$daemon_mode"
default_cmd="/bin/bash"
start_cmd='/tomcat/default/bin/catalina.sh run'

docker run \
    $docker_run_mode \
    -it \
    --name apf_tomcat8 \
    -p 0.0.0.0:8080:8080 \
    apf/tomcat8:latest \
    $start_cmd
