#include <stdio.h>
#include <ctype.h>
int main() {
	char h;
  scanf("%c",&h);
  if(h>='a' && h<='z')
      printf("%c",toupper(h));
    else
      printf("%c",tolower(h)); 
	return 0;
}