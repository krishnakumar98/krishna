#include <iostream>
#include <string.h>
using namespace std;

int main() {
char a[25],b[25];
int l,l1,i;
cin>>a>>b;
l=strlen(a);
l1=strlen(b);
for(i=0;i<l1;i++)
{
  a[l]=b[i];
  l++;
}
a[l]='\0';
cout<<a;
return 0;
}
