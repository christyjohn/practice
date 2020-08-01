#include "std_lib_facilities.h"

int main()
{
    // a constexpr symbolic constant must be given a value
    // that is know at compile time
    constexpr double pi = 3.14159;
    // pi = 7; // error : assignment to a constant
    double r = 34.5;
    double c = 2 * pi * r;

    constexpr int max = 17;
    int val = 19;
    max + 2;
    val + 2;

    return 0;
}

constexpr int max2 = 100;

void use(int n)
{
    constexpr int c1 = max2 + 7;
    // constexpr int c2 = n + 7;  // error: we don't know the value of n at compile time

    //
    // for variables whose value is initailized with a value that is not known at compile time
    const int c2 = n + 7;
    //c2 = 7; // error: must be a modifable value
}
