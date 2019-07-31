#include <stdio.h>
#include <math.h>
int main() {
  int n,d,p,sum=0;
  scanf("%d",&n);
  d=n;
  while(n>0){
    sum+=pow(n%10,3);
    n/=10; }
  if(sum==d) printf("Armstrong Number");
  else printf("Not an Armstrong Number");
  
  return 0;
}