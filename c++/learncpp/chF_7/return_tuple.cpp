#include <tuple>
#include <iostream>

std::tuple<int, double> returnTuple() // return a tuple that contains an int and a double
{
    return { 5, 6.7 };
}

int main()
{
    //std::tuple<int, double> s{ returnTuple() }; // get our tuple, prior to c++17
    std::tuple s{ returnTuple() }; // c++ 17
    std::cout << std::get<0>(s) << ' ' << std::get<1>(s) << '\n';// use std::get<n> to get the nth element of the tuple

    return 0; 
}
