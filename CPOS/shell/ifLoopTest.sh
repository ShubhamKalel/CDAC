#!/bin/bash
#
shellname="bash"

if [ "$shellname" = "ash" ]
then
	echo "Using bash shell"
elif [ "$shellname" = "csh" ]
then
	echo "Using C shell"
else
	echo "Not using any other sherll"
fi
