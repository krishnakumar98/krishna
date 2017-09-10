#include<stdio.h>
void main()
{
	int n;
	scanf("%d",&n);
	if(n==0)
		printf("zero");
	else if(n>0)
	{
		printf("positive number");
	}
	else
		printf("negative number");
}
