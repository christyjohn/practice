#include <iostream>

int main()
{
    bool b{}; // default initialize to false (0)
    std::cout << "Enter a boolean value: ";
    std::cin >> b;
    std::cout << "You entered: " << b << "\n";

    return 0;
}