no=int(input("Enter a number"))
l=1
s=0
while(2**l<=no):
	if(2**l==no):
	  s=1
	  break
	l=l+1
if(s==1):
	print("yes")
else:
	print("no")
