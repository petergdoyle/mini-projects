#!/bin/sh
db2 -tf /scripts/apfdbcreate.ddl
db2 -tf /scripts/apfddl.sql
