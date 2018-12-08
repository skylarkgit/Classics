// Wut?
#include<stdio.h>

int main() {
    int *((*x)())[2];
    x();
    printf("after x\n");
}

int *((*x)())[2]
{
    int **str;
    str = (int*)malloc(sizeof(int)*2);
    return str;
}