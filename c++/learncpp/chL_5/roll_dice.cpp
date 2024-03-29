#include <iostream>
using std::cout;

#include <cstdlib> // for std::rand() and std::srand()
#include <ctime> // for std::time()

// Generate a random number between min and max (inclusive)
// Assumes std::srand() has already been called
// Assumes max - min <= RAND_MAX
int getRandomNumber(int min, int max)
{
    // static used for efficiency, so we only calculate this value once
    static constexpr double fraction { 1.0 / (RAND_MAX + 1.0) };
    // evenly distribute the random number across our range
    return min + static_cast<int>((max - min + 1) * (std::rand() * fraction));
}

int main()
{
    // set initial seed value to system clock
    std::srand(static_cast<unsigned int>(std::time(nullptr))); 

    for (int count{ 1 }; count <= 100; ++count)
    {
        std::cout <<getRandomNumber(1, 6) << '\t';
 
        // If we've printed 5 numbers, start a new row
        if (count % 5 == 0)
            std::cout << '\n';
    }

    return 0;
}