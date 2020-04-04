#include <iostream>
using std::cout; using std::cin;

int main()
{
    cout << "Enter an integer: ";
    int x{};
    cin >> x;

    cout << "enter another integer: ";
    int y{};
    cin >> y;

    cout << "The reminder is: " << x % y << '\n';

    if ((x % y) == 0)
        cout << x << " is evenly divisible by " << y << '\n';
    else
        cout << x << " is not evenly divisible by " << y << "\n";

    return 0;
}