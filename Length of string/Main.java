#include<stdio.h>
#include<string.h>
int main()
{
  char s[100];
  scanf("%[^\n]%*c", s);
  printf("%d",strlen(s));
  return 0;
}