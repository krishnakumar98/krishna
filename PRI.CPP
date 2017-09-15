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
   cout<<"\nThe given no "<<n<<" is prime number";
 else
   cout<<"\nThe given no "<<n<<" is not prime number";
}