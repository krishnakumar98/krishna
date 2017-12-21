#include<iostream.h>
void main()
{
 int n,i;
 cout<<"\nEnter a number for prime";
 cin>>n;
 for(i=2;i<=n;i++)
 {
   if(n%i==0)
     break;
 }
 if(i==n)
   cout<<"\yes";
 else
   cout<<"\nno ";
}
