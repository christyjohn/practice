#include <iostream>
using std::cout; using std::cin;

int main()
{
    cout << "Input a keyboard character: ";

    char ch{};
    std::cin >> ch;
    std::cout << ch << " has ASCII code " << static_cast<int>(ch) << '\n'; 

    return 0;
}
