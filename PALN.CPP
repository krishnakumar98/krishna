#include<iostream.h>
void main()
{
  int n,n1,rev=0,temp;
  cout<<"\nEnter a value for check palindrome";
  cin>>n;
  temp=n;
  while(n>0)
  {
    n1=n%10;
    n=n/10;
    rev=rev*10+n1;
  }
  if(temp==rev)
    cout<<"\nThe given no  "<<temp<<" is palindrome";
  else
    cout<<"\nThe given no  "<<temp<<" is not palindrome";
}