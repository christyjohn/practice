#include <iostream>

int main()
{
    int value{ 5 };
    void* voidPtr{ &value };

    // illegal: cannot dereference a void pointer
    //std::cout << *voidPtr <<'\n'; // expression must be a pointer to a complete object type

    int* intPtr{ static_cast<int*>(voidPtr) }; // however, if we cast our void pointer to an int pointer...

    std::cout << *intPtr << '\n'; // then we can dereference it like normal

    return 0;
}