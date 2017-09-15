#include<stdio.h>
void main()
{
int n,count=0;
printf("\Enter a value");
scanf("%d",&n);
while(n>0)
{
  count++; 
  n/=10;
 }
 printf("no of digits in given no is  %d",count);
 }
