#include <stdio.h>

int main(void)
{
    int i = 365,  j = 7;
    int next_multiple = i + j - i % j;

    printf("Next multiple of %i after %i: %i\n", j,  i, next_multiple);

    i = 12258,  j = 23;
    next_multiple = i + j - i % j;

    printf("Next multiple of %i after %i: %i\n", j,  i, next_multiple);

    i = 996,  j = 4;
    next_multiple = i + j - i % j;

    printf("Next multiple of %i after %i: %i\n", j,  i, next_multiple);

    return 0;
}