#include<iostream.h>
void main()
{
 int low,upp,i,n,n1,t,rev;
 cout<<"\nEnter a lower limit";
 cin>>low;
 cout<<"\nEnter upper limit";
 cin>>upp;
 for(i=low;i<=upp;i++)
 { rev=0;
 t=n=i;

 while(n>0)
 {
 n1=n%10;
 n=n/10;
 rev=rev+(n1*n1*n1);
 }
 if(rev==t)
 {
  cout<<"\n"<<t;
 }
}

}