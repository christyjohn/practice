#include <iostream>

using std::cout; using std::cin;

int main()
{
    cout << "Enter an integer: ";
    int x {};
    cin >> x;

    if (x == 0)
        cout << "The value is zero.\n";

    return 0;
}
