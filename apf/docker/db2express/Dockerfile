FROM ibmcom/db2express-c

#
# set the proxy if required
#
#COPY set_proxy.sh /set_proxy.sh
#RUN ./set_proxy.sh

RUN yum -y install vim bash-completion tree git curl wget telnet net-tools

COPY entrypoint.sh /entrypoint.sh
COPY scripts/ /scripts

RUN chmod +x *sh

CMD /bin/bash
