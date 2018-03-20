import math
a=input("Enter a number")
b=len(a)
c=int(a)
for i in range(1,b+1):
	if((c%10)%2==0):
		c=int(c/10)
	else:
		print(c%10)
		c=int(c/10)
