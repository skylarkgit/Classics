#include<stdio.h>

void m(int p) {
    printf("%d\n", p);
}

int main(){
    int a=5, b=6;
    // Will it run or give a compilation error
    m(a, b);
    printf("%d %d\n", a, b);
}
