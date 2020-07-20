#include "../std_lib_facilities.h"

int main()
{
    int val1, val2;
    cout << "Enter 2 integers: ";
    cin >> val1 >> val2;

    if (val1 < val2)
        cout << val1 << " is lesser than " << val2 << "\n";
    if (val1 > val2)
        cout << val2 << " is greaer than " << val1 << "\n";
    if (val1 == val2)
        cout << val1 << " is equal to " << val2 << "\n";

    cout << "Sum of " << val1 << " and " << val2 << " is " <<  val1 + val2 << "\n";
    cout << "Difference of " << val1 << " and " << val2 << " is " << val1 - val2  <<  "\n";
    cout << "Product of " << val1 << " and " << val2 << " is " <<  val1 * val2 << "\n";
    cout << "Ratio of " << val1 << " and " << val2 << " is " << (double)val1 / (double)val2 << "\n";
    
    return 0;
}