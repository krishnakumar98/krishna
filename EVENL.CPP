#include<iostream.h>
void main()
{
  int low,upp,i;
  cout<<"\nEnter the lower limit";
  cin>>low;
  cout<<"\nEnter the upper limit";
  cin>>upp;
  for(i=low+1;i<=upp-1;i++)
     {
       if(i%2==0)
	{
	  cout<<"\n"<<i;
	}
     }
}
