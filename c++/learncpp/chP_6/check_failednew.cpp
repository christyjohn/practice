#include <iostream>

int main()
{
    int* value{ new (std::nothrow) int{} }; // ask for an integer's worth of memory
    if (!value) // handle case where new returned null
    {
        // Do error handling here
        std::cout<< "Could not allocate memory";
    }    

    return 0;
}