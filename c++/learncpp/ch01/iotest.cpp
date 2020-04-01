#include <iostream>

int main()
{
    int x{3.4};
    std::cout << "Enter a number: ";
    std::cin >> x;
    std::cout << "You entered " << x << '\n';

    return 0; 
}