#include<stdio.h>

int main () {
    int i = 320;
    char *ptr = (char *)&i;
    printf("%d\n", *ptr);
}