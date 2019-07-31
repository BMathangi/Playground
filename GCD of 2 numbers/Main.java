#include <stdio.h>
int gcd(int a,int b);
int main()
{
  int n1, n2, ans;
  scanf("%d %d", &n1, &n2);
  ans = gcd(n1,n2);
  printf("%d",ans);
  return 0;
}
int gcd(int n1,int n2){
  int i,g;
  for(i=1; i <= n1 && i <= n2; ++i)
  {
    if(n1%i==0 && n2%i==0)
      g = i;
  }
  return g; }