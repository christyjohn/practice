#include <iostream>

int main()
{
    int* ptr{ new int{} }; // dynamically allocate an integer
    int *otherPtr{ ptr }; // otherPtr is now pointed at that same memory location

    delete ptr; // return the memory to the operating system.  ptr and otherPtr are now dangling pointers.
    ptr = nullptr; // ptr is now nullptr

    std::cout << *ptr << '\n'; 
    std::cout << *otherPtr << '\n'; 

    return 0;
}