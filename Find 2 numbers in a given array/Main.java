#include<stdio.h>
int main()
{
  int n,i,e1,e2,p1=-1,p2=-1;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d%d",&e1,&e2);
  for(i=0;i<n;i++){
    if(e1==a[i]) p1=i;
    if(e2==a[i]) p2=i;}
  printf("Element 1 index = %d\nElement 2 index = %d",p1,p2);  
}