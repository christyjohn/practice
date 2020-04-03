#include <iostream>
using  std::cout;

int main()
{
    unsigned short x{ 0 };      // smallest 2-byte unsigned value possible
    cout << "x was : " << x << "\n";

    x = -1;      // -1 is out of our range, so we get wrap-around
    cout << "x is now: " << x << '\n';

    x = -2;      // -2 is out of our range, so we get wrap-around
    cout << "x is now: " << x << '\n';

    return 0;
}