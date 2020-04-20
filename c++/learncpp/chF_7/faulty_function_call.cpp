#include <iostream>

int foo()
{
    return 5;
}

int main()
{
    std::cout << reinterpret_cast<void*>(foo) << '\n';

    return 0;
}