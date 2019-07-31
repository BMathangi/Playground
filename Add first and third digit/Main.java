#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  printf("%d",(int)n%10+(int)n/100);
  return 0;
}