FROM centos:7

#
# enable epel repo
#
RUN yum -y install epel-release

#
# enable rpmforge yum repo
#
RUN yum -y install \
  http://pkgs.repoforge.org/rpmforge-release/rpmforge-release-0.5.3-1.el7.rf.x86_64.rpm

#
# basic make life easier stuff
#
RUN yum -y install vim bash-completion tree git curl wget telnet net-tools
