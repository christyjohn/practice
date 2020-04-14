#include <iostream>

void foo(int y)
{
    std::cout << "y = " << y << '\n'; 
}

int main()
{
    foo(5);

    int x = 6;
    foo(x);
    foo(x + 1);

    return 0;
}