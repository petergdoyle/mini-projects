#!/bin/sh


response=$(find /home/vagrant/.m2/ -name db2jcc*jar)
if [ "$response" == "" ]; then
  ../../ibm/mvn_install_db2-express-c_jdbc_drivers.sh
fi

cd db2client
mvn clean install
cd -
