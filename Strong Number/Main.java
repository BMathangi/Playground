#include <stdio.h>
int fact(int k){
  int a=1;
  for(int i=1;i<=k;i++)
    a*=i;
  return a; }
int main() {
  int n,d,sum=0;
  scanf("%d",&n);
  d=n;
  while(n>0){
    sum+=fact(n%10);
    n/=10; }
  if(sum==d)
    printf("Yes");
  else
    printf("No");
  return 0;
}