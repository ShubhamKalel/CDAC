#!/bin/bash
#
#val=`expr 2+2`
#echo "Total = $val"


#read and write

echo "Read 3 values : "
read var1
read var2
read var3

echo ""
echo " var1 : $var1"
echo "var2 : $var2 and var3: $var3"

#ADDITION
(( sum = $var1 + $var2))
((sum1=$var1 + $var2))
echo "sum : $sum"
echo ""
echo "sum1 = $sum1"
