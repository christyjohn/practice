#include <iostream>

// forward declaration of add() (using a function prototype)
int add (int x, int y);   

int main() 
{
     // this works because we forward declared add() above
    std::cout << "The sum of 3 and 4 is: " << add(3, 4) << "\n";

    return 0;
}