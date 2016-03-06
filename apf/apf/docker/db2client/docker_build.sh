#!/bin/sh
. ../../scripts/docker_functions.sh
. ../../scripts/color_and_format_functions.sh
no_cache=$1
./clean_and_build.sh
img_name="apf/db2client"
docker_build $no_cache
