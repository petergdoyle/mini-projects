#!/bin/sh

# Global Proxy Settings
export HTTP_PROXY=http://myproxy.net:80
export HTTPS_PROXY=$HTTP_PROXY
export http_proxy=$HTTP_PROXY
export https_proxy=$HTTP_PROXY
echo "proxy=$HTTP_PROXY" >> /etc/yum.conf

# GlobalSettings
cat >/etc/profile.d/proxy.sh <<-EOF
export HTTP_PROXY=$HTTP_PROXY
export HTTPS_PROXY=$HTTP_PROXY
export http_proxy=$HTTP_PROXY
export https_proxy=$HTTP_PROXY
EOF
