#include<stdio.h>
void main()
{
 int n,s=0,i;
 printf("\nEnter the values for n");
 scanf("%d",&n);
 for(i=1;i<=n;i++)
    s=s+i;
 printf("\nsum of %d no is %d",n,s);
}
