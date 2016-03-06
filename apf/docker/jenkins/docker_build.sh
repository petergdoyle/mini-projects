#!/bin/sh
. ../../scripts/docker_functions.sh
no_cache=$1
img_name="apf/jenkins"
docker_build $no_cache
