#include <iostream>
using std::cout; using std::cin;

int main()
{
    cout << "Enter an integer: ";
    int value {};
    cin >> value;

    if (value > 0)
    {
        if ((value% 2) == 0)
        {
            cout << value << " is positive and even\n"; 
        }
        else 
        {
            cout << value << " is positive a odd\n";
        }
    }

    return 0;
}