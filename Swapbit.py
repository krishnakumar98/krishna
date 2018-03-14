def switch_demo(a,b):  
   a=a^b
   b=a^b
   a=a^b
   print a,b
  
     
a=input("Enter a number\n")
b=input("Enter another number\n")
switch_demo(a,b)
