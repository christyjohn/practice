#include <bitset>
#include <iostream>
using std::cout;

int main()
{
    // we need 8 bits, start with bit pattern 0000 0101
    std::bitset<8> bits { 0b0000'0101 };
    bits.set(3);    // set bit position 3 to 1 (now we have 0000 1101)
    bits.flip(4);   // flip bit 4 (now we have 0001 1101)
    bits.reset(4);  // set bit4 back to 0 (now we have 0000 1101)

    cout << "All the bits: " << bits << "\n";
    cout << "Bit 3 has value: " << bits.test(3) << "\n";
    cout << "Bit 4 has value: " << bits.test(4) << "\n";

    return 0;
}
