#include <iostream>
using std::cout;

#include <bitset>

int main()
{
    std::bitset<4> x { 0b1100 };

    cout << x << '\n';
    cout << (x >> 1) << '\n';   // shift right by 1, yielding 0110
    cout << (x << 1) << '\n';   // shift left by 1, yielding 1000

    return 0;
}