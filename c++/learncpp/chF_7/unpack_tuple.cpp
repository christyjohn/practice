#include <tuple>
#include <iostream>

std::tuple<int, double> returnTuple() // return a tuple that contains an int and a double
{
    return { 5, 6.7 };
}

int main()
{
    int a;
    double b;
    std::tie(a, b) =  returnTuple();
    std::cout << a << ' ' << b << '\n'; 
    return 0; 
    
}
