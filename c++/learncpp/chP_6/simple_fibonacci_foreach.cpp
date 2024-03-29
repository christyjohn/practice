#include <iostream>

int main()
{
    constexpr int fibonacci[]{ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };

    for (auto number : fibonacci) // type is auto, so number has its type deduced from the fibonacci array
        std::cout << number << " ";

    std::cout << '\n';

    return 0;
}