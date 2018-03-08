#include <iostream>
#include <string.h>
using namespace std;

int main() {
char a[25],b[25];
int l,l1,i;
cin>>a>>b;
l=strlen(a);
l1=strlen(b);
if(l==l1)
{
    for(i=0;i<l;i++)
    {
        if(a[i]>b[i])
        {
            cout<<a;
            break;
        }
        else if(a[i]<b[i])
        {
            cout<<b;
            break;
        }
    }
    if(i==l)
    {
        cout<<a;
    }
}
else if(l>l1)
{
    cout<<a;
}
else
{
    cout<<b;
}
return 0;
}
