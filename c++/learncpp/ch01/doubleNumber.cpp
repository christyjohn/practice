#include <iostream>
using std::cout; using std::cin;

int main()
{
    std::cout << "Enter an integer: ";

    int num{0};
    cin >> num;

    num = num * 2;

    std::cout << "Double that number is: " << num << '\n';

    return 0;
}
