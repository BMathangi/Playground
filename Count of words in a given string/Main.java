#include<stdio.h>

int main()
{
  char s[100];
  scanf("%[^\n]%*c",s);
  int i,count=1;
  for(i=0;s[i]!='\0';i++)
    if(s[i]==' ')
      count++;
  printf("%d",count);
  
}