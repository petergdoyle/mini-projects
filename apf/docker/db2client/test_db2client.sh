#!/bin/sh

# this program is meant to test that the docker db2 container is running
cd db2client
java -jar target/db2client-1.0-SNAPSHOT.jar jdbc:db2://127.0.0.1:50000/sample
cd -
