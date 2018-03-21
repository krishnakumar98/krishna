no=input("Enter a string")
num=0
alp=0
for i in no:
	if(i.isnumeric()):
		num=1
	elif(i.isalpha()):
		alp=1
if(num==1 and alp==1):
	print("yes")
else:
	print("no")
