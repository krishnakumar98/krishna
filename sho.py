n=int(input("Enter the no of no's"))
p=int(input("Enter the pos"))
li=[]
for i in range(1,n+1):
	li.append(int(input()))
a=sorted(li)
print(a[p-1])
