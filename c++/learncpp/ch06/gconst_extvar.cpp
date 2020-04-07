#include "constants.h" // include a copy of each constant in this file

#include <iostream>
using std::cout; using std::cin;;

int main()
{
    cout << "Enter a radius: ";
    int radius{};
    cin >> radius;

    cout << "The circumferencce is: " << 2 * radius * constants::pi << '\n';

    return 0;
}