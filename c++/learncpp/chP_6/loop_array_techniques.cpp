#include <array>
#include <iostream>
using std::cout;

int main()
{
    // The type is automatically deduced to std::array<int, 7> (Requires C++17).
    // Use the type std::array<int, 7> if your compiler doesn't support C++17.
    std::array data{ 0, 1, 2, 3, 4, 5, 6 };
    std::size_t length{ std::size(data) };

    // while-loop with explicit index
    std::size_t index{ 0 };
    while (index != length)
    {
        cout<< data[index] << ' ';
        ++index;
    }
    cout << '\n';

    // for-loop with explicit index
    for (index = 0; index < length; ++index)
        cout << data[index] << ' ';

    cout << '\n';

    // for-loop with pointer (Note: ptr can't be const, because we increment it)
    for (auto ptr{ &data[0] }; ptr != (&data[0] + length); ++ptr)
        cout << *ptr<< ' ';

    cout << '\n';

    // ranged-based for loop
    for (int i : data)
    {
        std::cout << i << ' ';
    }
    std::cout << '\n';
 
    return 0;
}