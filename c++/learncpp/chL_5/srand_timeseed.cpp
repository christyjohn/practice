#include <iostream>
using std::cout;

#include <cstdlib> // for std::rand() and std::srand()
#include <ctime> // for std::time()

int main()
{
    // set initial seed value to system clock
    std::srand(static_cast<unsigned int>(std::time(nullptr))); 

    // Print 100 random numbers
    for (int count{ 1 }; count <= 100; ++count)
    {
        std::cout << std::rand() << '\t';
 
        // If we've printed 5 numbers, start a new row
        if (count % 5 == 0)
            std::cout << '\n';
	}

    return 0;
}