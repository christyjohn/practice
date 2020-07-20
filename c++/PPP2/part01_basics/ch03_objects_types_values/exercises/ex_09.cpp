#include "../std_lib_facilities.h"

int main()
{
    cout << "Enter a number from 0 to 4: ";
    string number;
    cin >> number;

    if (number == "0")
        cout << "Zero\n";
    else if (number == "1")
        cout << "One\n";
    else if (number == "2")
        cout << "Two\n";
    else if (number == "3")
        cout << "Three\n";
    else if (number == "4")
        cout << "Four\n";
    else 
        cout << "not a number I know!\n";

    return 0;
}