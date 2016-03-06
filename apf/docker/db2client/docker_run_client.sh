#!/bin/sh

daemon_mode='-d'
temp_mode='--rm'
docker_run_mode="$temp_mode"

docker_cmd='java -jar target/db2client-1.0-SNAPSHOT.jar jdbc:db2://apf_db2express_server:50000/sample'

docker run \
    $docker_run_mode \
    -it \
    --name apf_db2client \
    --link apf_db2express_server:apf_db2express_server \
    apf/db2client:latest \
    $docker_cmd
