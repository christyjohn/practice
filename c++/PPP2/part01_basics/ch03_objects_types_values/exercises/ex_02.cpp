#include "../std_lib_facilities.h"

int main()
{
    double kms, miles;
    double kms_in_mile = 1.609;

    cout << "Enter the distance in miles: ";
    cin >> miles;
    kms = miles * kms_in_mile;
    cout << miles << " miles is " << kms << " kms.\n";

    return 0;
}