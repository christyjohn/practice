#include <iostream>

// this extern is a forward declaration of a variable named g_x that is 
// defined somewhere else
extern int g_x;

// this extern is a forward declaration of a const variable named g_y that is
// defined somewhere else
extern const int g_y;

int main()
{
    std::cout << g_x << '\n'; // prints 2
    std::cout << g_y << '\n'; // prints 3
 
    return 0;
}