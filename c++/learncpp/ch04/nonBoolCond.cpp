#include <iostream>
 
int main()
{
    if (4) // nonsensical, but for the sake of example...
        std::cout << "hi\n";
    else
        std::cout << "bye\n";
 
    return 0;
}