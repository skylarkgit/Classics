#include<stdio.h>

int main(){
    struct emp {
        char name[20];
        int age;
        float sal;
    };

    struct emp e = {"Tiger"};
    // What should be the output , 0 or garbage 
    printf("%d, %f\n", e.age, e.sal);
}
