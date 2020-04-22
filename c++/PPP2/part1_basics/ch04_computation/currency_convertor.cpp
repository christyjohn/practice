#include "std_lib_facilities.h"

int main()
{
    constexpr double dollar_per_kronor = 0.099;
    constexpr double dolar_per_yen = 0.0093;
    constexpr double dollar_per_pound = 1.24;
    
    double currency = 1;

    char unit = 0;
    cout << "Please enter cash value followed by a currency unit (k, y or p):\n";
    cin >> currency >> unit;
    if (unit == 'k')
        cout << currency << " kronor == " << dollar_per_kronor * currency << " dollars\n";
    else if (unit == 'y')
        cout << currency << " yen == " << dolar_per_yen * currency << " dollars\n";
    else if (unit == 'p')
        cout << currency << " pounds == " << dollar_per_pound * currency << " dollars\n";
    else
        cout << "Sorry, I don't know a currency unit called '" << unit << "'\n";
        
        return 0;
}