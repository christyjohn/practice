#include <iostream>

int main()
{
    double *ptr{ 0 };

    // pointers convert to boolean false if they are null, and boolean true if they are non-null
    if (ptr)
        std::cout << "ptr is pointing to double value\n";
    else
        std::cout << "ptr is a null pointer\n";

    return 0;
}