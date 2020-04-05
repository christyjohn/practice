#include <iostream>
using std::cout;

namespace foo:: goo // goo is a namespace inside the foo namespace
{
    int add(int x, int y)
    {
        return x + y;
    }
}

int main()
{
    cout << foo::goo::add(3, 4) << '\n';

    return 0;
}