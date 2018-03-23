n=int(input("Enter a number"))
li=[]
r=0
while(n>0):
	n1=n%10
	li.append(n1)
	n=int(n/10)
a=sorted(li)
for i in range(len(a)-1,-1,-1):
	r=r*10+a[i]
print(r)	
