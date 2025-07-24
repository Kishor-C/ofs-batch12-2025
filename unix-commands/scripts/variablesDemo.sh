#!/bin/bash
name="Kishor"
#this prints the name
echo "Hello $name"
num1=20
num2=30
#this prints the result
result=$((num1 + num2))
echo "Result=$result"
: <<'ENDCMD' 
this is multi line comment
we can some code here
dd
ENDCMD
echo "DONE"

