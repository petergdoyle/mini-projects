FROM ibmcom/db2express-c

RUN yum -y install vim bash-completion tree git curl wget telnet net-tools

COPY entrypoint.sh /entrypoint.sh 

RUN chmod +x *sh

CMD /bin/bash
