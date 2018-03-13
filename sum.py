def switch_demo(n):
    s=0  
    while(n>0):
      n1=n%10
      s=s+n1
      n=n/10
    print s
arg=input("Enter a number\n")
switch_demo(arg)
