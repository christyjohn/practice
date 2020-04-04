#include <iostream>
using std::cout;

#include <bitset>

int main()
{
    unsigned int x { 0b0100 };
    x = x << 1; // use operator<< for left shift
    cout << std::bitset<4>{ x } << '\n';

    return 0;
}