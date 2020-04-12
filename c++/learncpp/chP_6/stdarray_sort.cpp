#include <algorithm>
#include <array>
#include <iostream>

int main()
{
    std::array myArray{ 7, 3, 1, 9, 5 };
    //std::sort(myArray.begin(), myArray.end()); // sort the array forwards
    std::sort(myArray.rbegin(), myArray.rend()); // sort the array backwards

    for (auto element : myArray)
        std::cout << element << ' ';

    std::cout << '\n';

    return 0;
}