n=int(input())
li=[]
for i in range(0,n):
	li.append(int(input()))
li.sort(reverse=True)
for i in li:
	print(i)
