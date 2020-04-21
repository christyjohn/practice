#include <iostream>

// return the sum of all the integers between 1 (inclusive) and sumto (inclusive)
// returns 0 for negative numbers
int sumTo(int sumto)
{
    if (sumto <= 0)
        return 0; // base case (termination condition) when user passed in an unexpected parameter (0 or negative)
    else if (sumto == 1)
        return 1; // normal base case (termination condition)
    else
        return sumTo(sumto - 1) + sumto; // recursive function call    
}

int main()
{
    std::cout << "Enter a value upto whih you need sum from 1: ";
    int value;
    std::cin >> value;
    std::cout << "Sum = " << sumTo(value) << '\n'; 

    return 0;
}