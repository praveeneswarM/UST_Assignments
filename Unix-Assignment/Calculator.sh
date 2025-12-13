echo "Enter Number 1"
read num1 
echo "Enter Number 2" 
read num2 
echo "Enter Operator (+,-,*,/)"
read opr

if [ "$opr" = "+" ]; then
	echo "Result $((num1+num2))"
elif [ "$opr" = "-" ]; then 
	echo "Result $((num1-num2))"
elif [ "$opr" = "*" ]; then
	echo "Result $((num1*num2))"
elif [ "$opr" = "/" ]; then
	echo "Result $((num1/num2))"
fi
