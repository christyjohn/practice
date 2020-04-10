#include <iostream>
using std::cout;

#include <cstring>

int main()
{
    char source[]{ "Copy this!" };
    char dest[5]; // note that the length of dest is only 5 chars!
    std::strcpy(dest, source);  // overflow
    cout << dest << '\n'; 

    return 0;
}