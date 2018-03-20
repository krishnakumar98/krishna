a=input("Enter the string")
str1=""
str2=""
for i in range(0,len(a)):
	if(i%2):
		str1+=a[i]
	else:
		str2+=a[i]
print(str2,str1)
