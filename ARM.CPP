#include<iostream.h>
void main()
{
 int n,n1,t,rev=0;
 cout<<"\nEnter a no for armstrong number";
 cin>>n;
 t=n;
 while(n>0)
 {
 n1=n%10;
 n=n/10;
 rev=rev+(n1*n1*n1);
 }
 if(rev==t)
 {
  cout<<"\nthe given no "<<t<<" is armstrong";
 }
 else
 {
  cout<<"\nThe given no "<<t<<" is not armstrong";
 }
}