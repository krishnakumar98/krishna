def gcd(a,b):
	if(a%b==0):
		print(b)
	else:
		gcd(b,a%b)	  
a=int(input("Enter the two no's"))
b=int(input())
if(a<b):
	(a,b)=(b,a)
gcd(a,b)

