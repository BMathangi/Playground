#include<stdio.h>
int main()
{
  int n,i,k,f1=0;
  int f2=1;
  scanf("%d",&n);
  printf("%d %d ",f1,f2);
  for(i=2;i<n;i++){
    k=f1+f2;
    printf("%d ",k);
    f1=f2; f2=k; }
  return 0;
}