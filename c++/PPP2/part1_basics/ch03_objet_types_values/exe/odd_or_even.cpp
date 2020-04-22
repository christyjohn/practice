#include "std_lib_facilities.h"

int main()
{
    cout << "Enter an integer : ";
    int val;
    cin >> val;

    if ( val % 2 == 0)
        cout << "The value " << val << " is even.\n";
    else
        cout << "The value " << val << " is odd.\n";
    
    return 0;
}