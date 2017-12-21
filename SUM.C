#include<stdio.h>
void main()
{
 int n,k,a[100],s=0,i;
 printf("\nEnter the values for n and k");
 scanf("%d%d",&n,&k);
 for(i=0;i<n;i++)
    scanf("%d",&a[i]);
 for(i=0;i<k;i++)
    s=s+a[i];
 printf("\nsum of %d no in the given array  is %d",k,s);
}
