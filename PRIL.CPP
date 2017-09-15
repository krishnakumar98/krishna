#include<iostream.h>
void main()
{
 int n,i,low,upp,j;
 cout<<"\nEnter a lower limit";
 cin>>low;
 cout<<"\nEnter a upper limit";
 cin>>upp;
 for(j=low;j<=upp;j++)
 {
  n=j;
 for(i=2;i<=j;i++)
 {
   if(n%i==0)
     break;
 }
 if(i==n)
   cout<<"\n"<<n;
 }
}