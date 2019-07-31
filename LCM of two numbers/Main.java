#include<stdio.h>
int main()
{
  int a,b,max,min,i=2;
  scanf("%d%d",&a,&b);
  max = a>b?a:b;
  int m = max;
  min = a<b?a:b;
  while(1){
    if(max%min==0){ printf("%d",max); break; }
    else { max=m*i; i++; }
  }
  return 0;
}