def switch_demo(a):  
   r=0 
   while(a>0):
      n=a%10
      r=r*10+n
      a=a/10
   a=r
   r=0
   while(a>0):
      n=a%10
      print n 
      a=a/10
  
     
a=input("Enter a number\n")
switch_demo(a)
