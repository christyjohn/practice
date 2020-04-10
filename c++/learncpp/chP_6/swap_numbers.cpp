#include <utility> // for std::swap, use <algorithm> instead if <C++11

#include <iostream>
using std::cout;

int main()
{
    int x{ 2 };
    int y{ 4 };
    cout << "Before swap: x = " << x << ", y = " << y << '\n';
    std::swap(x, y);// swap the values of x and y
    cout << "After swap: x = " << x << ", y = " << y << '\n';

    return 0;
}