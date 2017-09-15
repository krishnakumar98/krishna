#include<iostream.h>
void main()
{
  int n,p,r=1,i;
  cout<<"\nEnter a no";
  cin>>n;
  cout<<"\nEnter a no for exponential";
  cin>>p;
  for(i=1;i<=p;i++)
  r=r*n;
  cout<<"\nThe power of "<<n<<" about "<<p<<" is "<<r;
}
