#include <stdio.h>
#include<math.h>
int main()
{
  	int b,e,ans=1;
  scanf("%d%d",&b,&e);
  if(e<0){ printf("Wrong input"); }
  else{
    for(int i=0;i<e;i++){
    ans*=b; }
    printf("%d",ans); }
  
  
    return 0;
}