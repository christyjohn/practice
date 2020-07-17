#include "std_lib_facilities.h"

int main()
{
    cout << "Pleae enter your age\n" ;
    double age;
    double age_in_months;
    cin >> age;
    age_in_months = age * 12;
    cout << "You are " << age_in_months << " months old.\n";

    return 0;
}