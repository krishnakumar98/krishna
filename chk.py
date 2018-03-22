n=int(input("Enter the n"))
s=int(input("Enter the s"))
c=1
for i in range(0,n):
	a=int(input())
	if(s==a):
		c=0
if(c==1):
	print("no")
else:
	print("yes")
