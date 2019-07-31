#include<stdio.h>
#include<math.h>
int main()
{
  int n,d,i=0;
  int sum=0;
  scanf("%d",&n);
  while(n>0){
    d=n%10;
    sum+=d*pow(2,i++);
    n/=10; }
  printf("%d",sum);
  return 0;
}