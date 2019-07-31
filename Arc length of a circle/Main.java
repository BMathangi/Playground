#include<stdio.h>
int main(){
  float r,d,ans;
  scanf("%f%f",&r,&d);
  ans = 2*3.14*r*(d/360.0);
  printf("%.2f",ans); 
  return 0;
}