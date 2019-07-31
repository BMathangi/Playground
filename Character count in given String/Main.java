#include<stdio.h>
int main()
{
  int i,c=1;
  char a[25],c_c;
  scanf("%s",a);
  char p_c=a[0];
  for(i=1;;i++){
    c_c = a[i];
    if(a[0]==a[10]){
      printf("Invalid Input");
      break; }
    if(c_c==p_c)
      c++;
    else{
      printf("%c%d",p_c,c);
      c=1;
      p_c=c_c; }
    if(a[i]=='\0')
      break; }
  return 0; }