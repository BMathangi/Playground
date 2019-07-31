#include<stdio.h>
#include<math.h>
int main()
{
  int n,k,p;
  scanf("%d",&n);
  if(n%2==0){
    k=(n/2)-1;
    p=pow(3,k);
    printf("%d",p); }
  else{
    k=n/2;
    p=pow(2,k);
    printf("%d",p); }     
  return 0;
}