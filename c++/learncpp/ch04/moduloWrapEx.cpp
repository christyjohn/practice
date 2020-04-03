#include <iostream>
using  std::cout;

int main()
{
    unsigned short x{ 65535 };      // largest 16-bit unsigned value possible
    cout << "x was : " << x << "\n";

    x = 65536;      // 65536 is out of our range, so we get wrap-around
    cout << "x is now: " << x << '\n';

    x = 65537;      // 65537 is out of our range, so we get wrap-around
    cout << "x is now: " << x << '\n';

    return 0;
}