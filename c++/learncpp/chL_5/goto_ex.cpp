#include<iostream>
using std::cout; using std::cin;

#include <cmath>  // for sqrt() function

int main()
{
    double x;
tryAgain:   // this is a statement label
    cout << "Enter a non-negative number: ";
    cin >> x;

    if (x < 0.0)
        goto tryAgain;  // this is the goto statement

    cout << "The sqrt of " << x << " is " << sqrt(x) << '\n'; 

    return 0;
}
