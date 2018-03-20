a=input("Enter a string")
s=0 
for i in range(0,len(a)):
	if(a[i].lower()=='a' or a[i].lower()=='e' or a[i].lower()=='i' or a[i].lower()=='o' or a[i].lower()=='u'):
		s=1
		break
if(s==0):
	print("no")
else:
	print("yes")
