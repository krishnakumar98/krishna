s=int(input("Enter a number\n"))
for i in range(2,s+1):
	if(s%i==0):
		break;
if(s==i):
	print("yes")
else:
	print("no")

