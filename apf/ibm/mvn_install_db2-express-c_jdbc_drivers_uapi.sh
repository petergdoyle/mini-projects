#!/bin/sh

mvn install:install-file -Dfile=Db2JccJars/db2jcc_license_cu.jar -DgroupId=com.ibm -DartifactId=db2jcc_license_cu -Dversion=v10 -Dpackaging=jar
mvn install:install-file -Dfile=Db2JccJars/db2jcc.jar -DgroupId=com.ibm -DartifactId=db2jcc -Dversion=v10 -Dpackaging=jar
mvn install:install-file -Dfile=Db2JccJars/db2jcc4.jar -DgroupId=com.ibm -DartifactId=db2jcc4 -Dversion=v10 -Dpackaging=jar
