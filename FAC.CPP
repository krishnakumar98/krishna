#include<iostream.h>
void main()
{
 int n,i,f=1;
 cout<<"\nEnter a number for factorial";
 cin>>n;
 for(i=1;i<=n;i++)
  f=f*i;
cout<<"\nFactorial of given no"<<n<<"is"<<f;
}
