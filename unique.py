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
if(len(a)==0):
	print("unique")
else:
	print(a)
