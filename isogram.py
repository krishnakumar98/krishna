a=input("Enter the string")
s=1
for i in range(0,len(a)):
	for j in range(i+1,len(a)):
		if(a[i]==a[j]):
			s=0
			break
if(s):
	print("yes")
else:
	print("no")
