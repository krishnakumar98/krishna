n=int(input("Enter the number"))
s=1
while(n>0):
	n1=n%10
	n=int(n/10)
	s=s*n1
print(s)
