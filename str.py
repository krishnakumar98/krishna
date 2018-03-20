a=input("Enter the string")
n=0
for i in a:
	if(i==' '):
		s=int(a[:n])
		sy=a[n+1:n+2]
		s1=int(a[n+2:])
		break
	n=n+1
if(sy=='/'):
	print(int(s/s1))
elif(sy=='%'):
	print(s%s1)
