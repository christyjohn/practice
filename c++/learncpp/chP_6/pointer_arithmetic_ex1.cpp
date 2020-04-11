#include <iostream>
using std::cout;

int main()
{
    int value { 7 };
    int * ptr{ &value };

    cout << ptr << '\n';
    cout << ptr+1 << '\n';
    cout << ptr+2 << '\n';
    cout << ptr+3 << '\n';

    return 0;
}