#!/bin/sh
. ../../scripts/docker_functions.sh
. ../../scripts/color_and_format_functions.sh
no_cache=$1
img_name="apf/base"
docker_build $no_cache
