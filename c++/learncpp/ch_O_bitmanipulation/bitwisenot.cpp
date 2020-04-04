#include <iostream>
using std::cout;

#include <bitset>

int main()
{
    cout << std::bitset<4>{ ~0b0100u } << ' ' << std::bitset<8>{ ~0b0100u } 
         << '\n';

    return 0;
}