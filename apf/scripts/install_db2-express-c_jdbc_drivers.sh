#!/bin/sh

#download and unpack db2express-c jdbc drivers
curl -O 'https://delivery04.dhe.ibm.com/sdfdl/v2/sar/CM/IM/03ylu/0/Xa.2/Xb.jusyLTSp44S0BmNsYmFsd5K0OhKFJnTjhTpEn0Id5HySpco6aNey87fB69M/Xc.CM/IM/03ylu/0/v10.5fp1_jdbc_sqlj.tar.gz/Xd./Xf.LPR.D1vk/Xg.8513971/Xi.habanero/XY.habanero/XZ.Uh0dyEfH3wpq1_rwmsRrq_obyHE/v10.5fp1_jdbc_sqlj.tar.gz'
tar -xvf v10.5fp1_jdbc_sqlj.tar.gz

mvn install:install-file -Dfile=db2jcc.jar -DgroupId=ibm -DartifactId=db2jcc -Dversion=v10.5fp1 -Dpackaging=jar
mvn install:install-file -Dfile=db2jcc4.jar -DgroupId=ibm -DartifactId=db2jcc4 -Dversion=v10.5fp1 -Dpackaging=jar
