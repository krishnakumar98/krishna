n=int(input("Enter the number"))
p=int(input("Enter the position"))
li=[]
for i in range(1,n+1):
	a=int(input())
	li.append(a)
	if(i==p):
		c=a
print(c)
