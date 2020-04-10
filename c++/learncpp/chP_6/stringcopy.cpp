#include <iostream>
using std::cout;

#include <cstring>

int main()
{
    char source[]{ "Copy this!"};
    char dest[50];
    std::strcpy(dest, source);
    cout << dest << '\n';   // copy this

    return 0;
}
