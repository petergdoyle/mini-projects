#!/bin/sh

jdbc_url=$1

# this program is meant to test that the docker db2 container is running
cd db2client
java -jar target/db2client-1.0-SNAPSHOT.jar $jdbc_url
cd -
