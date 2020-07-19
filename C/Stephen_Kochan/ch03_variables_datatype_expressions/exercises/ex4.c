#include <stdio.h>

int main(void)
{
    int fahr = 100;
    double celsius = ((double)fahr - 32) / 1.8;

    printf("%i fahrenheit is equal to %f degree celsius\n", fahr, celsius);

    return 0;
}