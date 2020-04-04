#include <bitset>
#include <iostream>
using std::cout;
 
int main()
{
    std::bitset<4> bits { 0b0100 };
    bits >>= 1;
    cout << bits << '\n';
 
    return 0;
}