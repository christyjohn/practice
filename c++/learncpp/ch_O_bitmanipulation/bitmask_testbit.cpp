#include <cstdint>

#include <iostream>
using std::cout;

int main()
{
    constexpr std::uint_fast8_t mask0{ 0b0000'0001 };
    constexpr std::uint_fast8_t mask1{ 0b0000'0010 };
    constexpr std::uint_fast8_t mask2{ 0b0000'0100 };
    constexpr std::uint_fast8_t mask3{ 0b0000'1000 };
    constexpr std::uint_fast8_t mask4{ 0b0001'0000 };
    constexpr std::uint_fast8_t mask5{ 0b0010'0000 };
    constexpr std::uint_fast8_t mask6{ 0b0100'0000 };
    constexpr std::uint_fast8_t mask7{ 0b1000'0000 };

    std::uint_fast8_t flags{ 0b0000'0101}; // 8 bits in size means room for 8 flags

    cout << "bit 0 is " << ((flags & mask0) ? "on\n" : "off\n");
    cout << "bit 1 is " << ((flags & mask1) ? "on\n" : "off\n");

    return 0;
}