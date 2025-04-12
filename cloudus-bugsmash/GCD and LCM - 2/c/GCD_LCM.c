#include <stdio.h>
#include <stdlib.h>

int gcd(int a, int b) {
    while (a != 0) {
        int temp = a;
        a = b;
        b = temp % b;
    }
    return b;
}

int lcm(int a, int b) {
    return abs(a * b) / gcd(a, b);
}

int main() {
    int num1, num2;

    printf("Enter the first number: ");
    scanf("%d", &num1);
    printf("Enter the second number: ");
    scanf("%d", &num2);

    int gcd_result = gcd(num1, num2);
    int lcm_result = lcm(num1, num2);

    printf("The GCD of %d and %d is %d\n", num1, num2, gcd_result);
    printf("The LCM of %d and %d is %d\n", num1, num2, lcm_result);

    return 0;
}
