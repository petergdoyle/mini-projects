#!/bin/sh
. scripts/docker_functions.sh
. scripts/color_and_format_functions.sh
no_cache=$1
docker_build_all $no_cache
docker_cleanup_dangling_images
