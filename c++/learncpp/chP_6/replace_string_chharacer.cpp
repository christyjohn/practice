#include <iostream>
using std::cout;

int main()
{
    char myString[]{ "string" };
    myString[1]= 'p';
    cout << myString<< '\n';

    return 0;
}