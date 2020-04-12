#include <iostream>
#include <vector>

int main()
{
    std::vector array{ 0, 1, 2, 4, 5};
    array.resize(3);  // set size to 5

    std::cout << "The length is: " << array.size() << '\n';
 
    for (int i : array)
        std::cout << i << ' ';
 
    std::cout << '\n'; 

    return 0;
}