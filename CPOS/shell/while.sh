#!/bin/bash

a=0
echo ""
while [ $a -lt 10 ]
do
	echo "Value = $a"
	if [ $a -eq 5 ]
	then
		break
	fi
	a=`expr $a + 1`
done
