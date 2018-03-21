n=int(input("Enter the number"))
r=0
while(n>0):
	n1=n%10
	n=int(n/10)
	r=r*10+n1
print(r)
