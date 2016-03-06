FROM apf/jdk8

RUN curl -O http://pkg.jenkins-ci.org/redhat/jenkins-1.651-1.1.noarch.rpm \
&& yum -y localinstall jenkins-1.651-1.1.noarch.rpm \
&& rm -f jenkins-1.651-1.1.noarch.rpm

CMD /bin/bash
