a=int(input("Enter a number"))
for i in range(2,a+1):
	if(a%i==0):
		break
if(a==i):
	print("no")
else:
     print("yes") 
