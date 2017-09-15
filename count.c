#include<stdio.h>
void main()
{
int n,count=0;
printf("\nEnter a value");
scanf("%d",&n);
while(n>0)
{
  count++; 
  n/=10;
 }
 printf("\nNo of digits in given no is  %d",count);
 }
