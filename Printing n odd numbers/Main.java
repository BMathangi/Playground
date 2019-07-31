#include <stdio.h>
int main() {
  int n,i,count=0;
  scanf("%d",&n);
  for(i=1;count<n;i+=2,count++)
    printf("%d\n",i);
	return 0;
}