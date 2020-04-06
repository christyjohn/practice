#include <iostream>

int add(int x, int y); // forward declaration for function add

int main()
{
    std::cout << add(3, 4) << '\n';

    return 0;
}

// This program won’t link, because function add is not accessible outside of add.cpp.