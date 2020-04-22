#include "std_lib_facilities.h"

int main()
{
    cout << "Enter the number of miles:\n";
    double miles;
    cin >> miles;
    double km_per_mile = 1.609;

    cout << miles << " miles = " <<  km_per_mile * miles << "kms.\n";

    return 0;
}