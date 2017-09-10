#include<stdio.h>
void main()
{
	 char ch;
	 char c[]={'a','e','i','o','u','A','E','I','O','U'};
	 int i,r=0;
	 scanf("%c",&ch);
	 for(i=0;i<10;i++)
		 if(ch==c[i])
		 {
			 printf("the given character is vowel");
			 r=1;
			 break;
		 }
	 if(r==0)
	 {
		 printf("the given character is consonant");
	 }
}