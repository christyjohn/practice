#include <iostream>
using std::cout;

#include <cstdint> // for std::int_fast64_t

// note: exp must be non-negative
std::int_fast64_t powint(int base, int exp)
{
    std::int_fast64_t result{ 1 };

    while (exp) 
    {
        if (exp & 1)
            result *= base;
        exp >>= 1;
        base *= base; 
    }

    return result;
}

int main()
{
    cout << powint(7, 12) << "\n";

    return 0;
}