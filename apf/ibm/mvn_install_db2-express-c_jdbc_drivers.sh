#!/bin/sh

#download and unpack db2express-c jdbc driver
if [[ ! -d 'drivers/' && ! "$(ls -A /drivers)" ]]; then
  default_url='https://delivery04.dhe.ibm.com/sdfdl/v2/sar/CM/IM/03ylu/0/Xa.2/Xb.jusyLTSp44S02VJV22BtgYilMUrbUlO0hPaH0JTA6dMnITLmFCyQyjw_RKk/Xc.CM/IM/03ylu/0/v10.5fp1_jdbc_sqlj.tar.gz/Xd./Xf.LPR.D1vk/Xg.8551501/Xi.habanero/XY.habanero/XZ.POhuDjR-yDisLtjb69NoX3ob6Ag/v10.5fp1_jdbc_sqlj.tar.gz'
  read -e -p "Browse to http://www-01.ibm.com/support/docview.wss?uid=swg21363866 \
  and determine the ibm db2express-c jdbc driver url. Enter the URL: " -i "$default_url" url

  mkdir download
  mkdir drivers
  cd download/
  curl -o download/v10.5fp1_jdbc_sqlj.tar.gz "$url"
  tar -xvf v10.5fp1_jdbc_sqlj.tar.gz
  unzip jdbc_sqlj/db2_db2driver_for_jdbc_sqlj.zip
  cp db2jcc*jar ../drivers
  cd -
  rm -fr download
fi
mvn install:install-file -Dfile=drivers-105fp1/db2jcc.jar -DgroupId=com.ibm -DartifactId=db2jcc -Dversion=v10.5fp1 -Dpackaging=jar
mvn install:install-file -Dfile=drivers-105fp1/db2jcc4.jar -DgroupId=com.ibm -DartifactId=db2jcc4 -Dversion=v10.5fp1 -Dpackaging=jar
