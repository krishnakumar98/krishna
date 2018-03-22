def rec(n):
	if(n%2==0):
		rec(int(n/2))
	else:
		print(n)
n=int(input("Enter the value"))
rec(n)
