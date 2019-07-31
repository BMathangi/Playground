#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,ans;
  scanf("%f%f",&a,&b);
  ans=pow(a,2)+pow(b,2);
  printf("%.2f",sqrt(ans));
  return 0;
}