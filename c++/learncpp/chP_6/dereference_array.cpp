#include <iostream>

int main()
{
    int array[]{ 9, 7, 5, 3, 1 };

    // dereferencing an array returns the first element (element 0)
    std::cout << *array << '\n'; // will print 9!

    char name[]{ "Jason "}; // C-style string (also an array)
    std::cout << *name << "\n";


    return 0;
}