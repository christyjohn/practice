#include <array>
#include <iostream>
#include <iterator>

int main()
{
    std::array array{ 1, 2, 3 };

    // Ask our array for the begin and end points (via the begin and end member functions).
    auto begin{ std::begin(array) };
    auto end{ std::end(array) };

    for (auto p{ begin }; p != end; ++p)    // ++ to move to next element.
        std::cout << *p << ' '; // dereference to get value of current element.

    std::cout << '\n';
}
