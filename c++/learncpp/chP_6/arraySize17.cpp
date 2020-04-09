#include <iostream> // for std::cout
#include <iterator> // for std::size
 
int main()
{
    int array[] = { 1, 1, 2, 3, 5, 8, 13, 21 };
    std::cout << "The array has: " << std::size_t(array) << " elements\n";
 
    return 0;
}