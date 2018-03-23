n=int(input("Enter a number"))
print("Enter the number")
li=[]
for i in range(0,n):
	li.append(int(input()))
a=[]
for i in range(0,n-1):
	for j in range(i+1,n):
		if(li[i]==li[j]):
			a.append(li[i])
for i in li:
	c=0
	for j in a:
		if(i==j):
			c=1
	if(c==0):
		print(i)
