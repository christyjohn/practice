#include <iostream>
using std::cout;

int main()
{
    int x = 5;
    cout << x << '\n'; // print the value of variable x
    cout << &x << '\n'; // print the memory address of variable x
    cout << *(&x) << '\n';  /// print the value at the memory address of variable x 
        //(parenthesis not required, but make it easier to read)
    //cout << *x << '\n';  operand of '*' must be a pointer
    int* y = &x;
    cout << *y << '\n';
    cout << y << '\n';

    return 0;
}
