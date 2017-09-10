#include<stdio.h>
void main()
{
	 char ch;
	 scanf("%c",&ch);
		 if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
		 {
			 printf("the given character is alphabet");
		 }
	 else
	 {
		 printf("the given character is not alphabet");
	 }
}