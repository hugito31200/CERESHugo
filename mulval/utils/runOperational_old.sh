#!/bin/sh

cat $1 /tool/mulval/lib/refinement.P > temp.P 

graph_gen.sh temp.p -v -p --cvss -a /tool/mulval/SCADA/operationalRules_old.P > /dev/null

rm temp.P

probAssess.sh