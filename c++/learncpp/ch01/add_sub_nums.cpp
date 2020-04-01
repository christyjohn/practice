#include <iostream>

using namespace std;

int main()
{
    std::cout << "Enter two integers: ";

    int num1{0}, num2{0};
    cin >> num1 >> num2;

    std::cout << "sum of the numbers is: " <<  num1 + num2 << '\n';
    std::cout << "Difference of the numbers is: " <<  num1 - num2 << '\n';


    return 0;
}
