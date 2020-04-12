#define __STDC_WANT_LIB_EXT1__ 1
#include <cstring>

#include <iostream>
using std::cout;

int main()
{
    char source[]{ "Copy this!" };
    char dest[5]; // note that the length of dest is only 5 chars!

    // GCC currently dosn't support thiss
    strcpy_s(dest, 5, source); // A runtime error will occur in debug mode

    std::cout << dest << '\n';

    return 0;
}