#include <iostream>
 
int main()
{
    char mychar = 'a';
    while (mychar <= 'z')
    {
        std::cout << mychar  << ' ' << static_cast<int>(mychar) << '\n';
        ++mychar;
    }
 
    return 0;
}