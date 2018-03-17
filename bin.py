no=int(input("Enter the number\n"))
stri=str(no)
for  i in range(1,len(stri)+1):
	if(int(stri[i-1:i])==0 or int(stri[i-1:i])==1):
		flag=1
	else:
		flag=0
		break;
if(flag==1):
	print("yes")
else:
	print("no")
