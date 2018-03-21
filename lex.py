st=input("Enter a string")
li=[]
for i in st:
	li.append(i)
a=sorted(li,key=str.upper)
val=""
for i in a:
	val=val+i
print(val)
	
