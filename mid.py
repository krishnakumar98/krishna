a=input("Enter a string")
s=len(a)
li=[]
string=""
for i in a:
	li.append(i)
if(s%2==1):
	li[int(s/2)]='*'
else:
	li[int(s/2)-1]='*'
	li[int(s/2)]='*'
for i in li:
	string+=i
print(string)
	
