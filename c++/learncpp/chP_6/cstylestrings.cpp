#include <iostream>
using std::cout;

#include <iterator>

int main()
{
    char myString[]{ "string" };
    const int length{ static_cast<int>(std::size(myString)) };
    // use instead if not C++17 capable
    //  const int length{ sizeof(myString) / sizeof(myString[0]) }; 
    cout << myString << " has " << length << " characters.\n";

    for (int index{ 0 }; index < length; ++index)
        cout << static_cast<int>(myString[index]) << " ";

    cout << '\n';

    return 0;
}