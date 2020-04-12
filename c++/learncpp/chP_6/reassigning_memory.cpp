#include <iostream>

int main()
{  
    int value = 5;
    int *ptr{ new int{} }; // allocate memory

    std::cout << ptr << '\n';

    delete ptr;

    ptr = &value; // reassign pointer to address of value

    std::cout << ptr << '\n';

    return 0;
}