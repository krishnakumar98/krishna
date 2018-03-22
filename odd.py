n=int(input("Enter the no of no's"))
p=int(input("Enter the pos"))
no=1
li=[]
for i in range(1,n+1):
	li.append(int(input()))
a=sorted(li)
for i in li:
	if(i%2):
		if(no==p):
			print(i)
			break
		else:
			no+=1 
