n=int(input("Enter a number"))
li=[]
r=""
for i in range(0,n):
	li.append(int(input()))
a=sorted(li)
for i in range(len(a)-1,-1,-1):
	r=r+str(a[i])
print(int(r))	
