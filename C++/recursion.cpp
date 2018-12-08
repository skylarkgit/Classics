#include <stdio.h>

int f(int &x, int c) {
    c = c - 1;
    if (c == 0) return 1;
    x = x + 1;
    return f(x, c) * x;
}

int fdash(int &x, int c) {
    c = c - 1;
    if (c == 0) return 1;
    x = x + 1;
    return x * f(x, c);
}

int main () {
    int x = 5;
    
    // Output = ?
    printf("%d\n", f(x, x));
    
    x = 5;

    // Output = ?
    printf("%d\n", fdash(x, x));
}