#include <iostream>
 
int main()
{
    int count = 1;
    int sum = 0; // sum is declared up here because we need it later (beyond the loop)
 
    while (count <= 5) // iterate 5 times
    {
        int x; // x is created here with each iteration
 
        std::cout << "Enter integer #" << count << ':';
        std::cin >> x;
 
        sum += x;
 
        // increment the loop counter
        ++count;
    } // x is destroyed here with each iteration
 
    std::cout << "The sum of all numbers entered is: " << sum << '\n';
 
    return 0;
}