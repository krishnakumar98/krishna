#include<iostream.h>
void main()
{
  int low,upp,i;
  cout<<"\nEnter the lower limit";
  cin>>low;
  cout<<"\nEnter the upper limit";
  cin>>upp;
  for(i=1+low;i<=upp-1;i++)
     {
       if(i%2==1)
	{
	  cout<<"\n"<<i;
	}
     }
}
