#include <stdio.h>

/** print Fahrenheit-Celsius table
 *  for fahr = 0, 20, ..., 300;m floating-point versioonn */
int main()
{
    float fahr, celsius;
    int lower, upper, step;

    lower = 0;      /* loweer limit of temperatture table */
    upper = 300;    /* upper limit */
    step = 20;      /* step size */

    fahr = lower;
    while (fahr <= upper) {
        celsius = (5.0 / 9.0) * (fahr - 32.0);

        printf("%3.0f %6.1f\n", fahr, celsius);
        fahr = fahr + step;
    }
}