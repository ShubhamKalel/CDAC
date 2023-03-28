#!/bin/bash
#
echo ""
echo "Enter2 numbars"
read num

case "$num" in
	100)
		echo "100"
		;;
	200)
		echo "200"
		;;
	*)
		echo "default : $num"
		;;
esac


