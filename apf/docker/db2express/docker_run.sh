#!/bin/sh

daemon_mode='-d'
temp_mode='--rm'
docker_run_mode="$daemon_mode"

db2inst1_pwd="magic_mike"
db2start_cmd="db2start"
default_cmd="/bin/bash"

docker run \
  $docker_run_mode \
  -it \
  --name apf_db2express_server \
  -p 0.0.0.0:50000:50000 \
  -v $PWD/scripts:/scripts \
  -e DB2INST1_PASSWORD=$db2inst1_pwd \
  -e LICENSE=accept   \
  apf/db2express:latest \
  $db2start_cmd
