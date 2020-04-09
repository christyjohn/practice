#include <iostream>
 
namespace Animals
{
    enum Animals // The name of this enum could be omitted since it isn't used anywhere
    {
        CHICKEN,
        DOG,
        CAT,
        ELEPHANT,
        DUCK,
        SNAKE,
        MAX_ANIMALS
    };
}
 
int main()
{
    int legs[Animals::MAX_ANIMALS] = { 2, 4, 4, 4, 2, 0 };
 
    std::cout << "An elephant has " << legs[Animals::ELEPHANT] << " legs.\n";
 
    return 0;
}
