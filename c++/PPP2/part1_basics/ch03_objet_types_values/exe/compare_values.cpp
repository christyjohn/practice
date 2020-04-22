#include "std_lib_facilities.h"

int main()
{
    cout << "Enter two integers: \n";
    int val1, val2;
    cin >> val1 >> val2;

    int smaller, larger, sum, difference, product, ratio;

    if (val1 < val2) 
    {
        smaller = val1;
        larger = val2;
    }
    else if (val1 > val2)
    {
        smaller = val2;
        larger = val1;
    }
    else if ( val1 == val2)
    {
        cout << "Both values are equal\n";
    }

    cout << "Smaller: " << smaller << ", Larger: " << larger << '\n';
    cout << "Sum: " << val1 + val2 << '\n';
    cout << "Difference: " << val1 - val2 << '\n';
    cout << "Product: " << val1 * val2 << '\n';
    cout << "Ratio: " << val1 / val2 << '\n';
    
    return 0;
}