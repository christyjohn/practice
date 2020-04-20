#include <iostream>

int foo(int x)
{
    return x;
}

int main()
{
    int (*fcnPtr)(int){ foo }; // assign fcnPtr to function foo
    int x = (*fcnPtr)(5); // call function foo(5)through fcnPtr
    int y = fcnPtr(5); // call function foo(5) through fcnPtr.

    std::cout << x << '\n';
    std::cout << y << '\n';

    return 0;
}