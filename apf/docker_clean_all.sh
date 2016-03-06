#!/bin/sh
. scripts/docker_functions.sh
. scripts/color_and_format_functions.sh

docker_remove_all_containers
docker_remove_all_images
docker_cleanup_dangling_images
