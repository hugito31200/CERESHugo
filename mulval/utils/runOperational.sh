#!/bin/sh

cat $1 /tool/mulval/lib/refinement.P > temp.P 

graph_gen.sh temp.p -v -p --cvss -a /tool/mulval/SCADA/operationalRules.P 

rm temp.P

probAssess.sh