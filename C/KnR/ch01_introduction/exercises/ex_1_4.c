#include  <stdio.h>

/** print Fahrenheit-Celsius table
 *  for fahr = 0, 20, ..., 300 floating-point version */
    

int main()
{
    float fahr, celsius;
    int lower, upper, step;

    lower = 0;      /* lower limit of temperature table */
    upper = 300;    /* upper limit */
    step = 20;      /* step size */

    celsius = lower;
    printf("Celsius\t  Fahrenheit\n");
    printf("--------------------\n");
    while (celsius <= upper) {
        fahr = (9.0/5.0) * celsius + 32.0;
        printf("%7.0f %12.1f\n",celsius, fahr);
        celsius = celsius + step;
    }    
    return 0;
}