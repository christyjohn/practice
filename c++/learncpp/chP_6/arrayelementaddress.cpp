#include <iostream>
using std::cout;

int main()
{
    int array[]{ 9, 7, 5, 3, 1 };

    cout << "Element 0 is at address: " << &array[0] << '\n';
    cout << "Element 1 is at address: " << &array[1] << '\n';
    cout << "Element 2 is at address: " << &array[2] << '\n';
    cout << "Element 3 is at address: " << &array[3] << '\n';

    return 0;
}
