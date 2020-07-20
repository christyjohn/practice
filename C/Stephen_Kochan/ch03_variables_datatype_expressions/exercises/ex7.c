#include <stdio.h>
#include <math.h>

int main(void)
{
    long double pol =((3.31 * pow(10, -8 )) * (2.01 * pow(10, -7)))
        / ((7.17 * pow(10, -6)) + (2.01 * pow(10, -8)));
    printf("%Le\n", pol);

    return 0;
}