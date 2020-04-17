#include <iostream>

inline int min(int x, int y)
{
    return x > y ? y : x;
}

int main()
{
    std::cout << min(5, 6) << '\n';
    std::cout << min( 8,3) << '\n'; 

    return 0;
}