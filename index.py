n=int(input("Enter a number"))
li=[]
n=0
for i in range(0,n):
	li.append(int(input()))
for i in range(0,n):
	if(i==li[i]):
		n=1
		print(li[i])
if(n==0):
	print("-1")
