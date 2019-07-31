#include<stdio.h>
int main()
{
  int n,i,ele,pos=-1;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d",&ele);
  for(i=0;i<n;i++)
    if(a[i]==ele)
      pos=i+1;
  (pos!=-1)?printf("%d",pos):printf("%d isn't present in the array.",ele);
  return 0;
}