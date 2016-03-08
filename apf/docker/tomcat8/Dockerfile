FROM apf/jdk8

RUN curl -L -O http://mirror.olnevhost.net/pub/apache/tomcat/tomcat-8/v8.0.32/bin/apache-tomcat-8.0.32.tar.gz \
  && mkdir -p /tomcat \
  && tar -xvf apache-tomcat-8.0.32.tar.gz -C /tomcat \
  && ln -s /tomcat/apache-tomcat-8.0.32 /tomcat/default \
  && rm -f apache-tomcat-8.0.32.tar.gz

COPY conf/* /tomcat/default/conf/

CMD /bin/bash
