#include <iostream>
using std::cout; using std::cin;

enum ErrorCode
{
    SUCCESS = 0,
    NEGATIVE_NUMBER = -1,
};

ErrorCode doSomething(int value)
{
     // if value is a negative number
    if (value < 0)
       // early return an error code
        return ErrorCode::NEGATIVE_NUMBER;
 
    // Do whatever here
 
    return ErrorCode::SUCCESS;
}

int main()
{
    cout << "Enter a positive number: ";
    int x;
    cin >> x;
 
    if (doSomething(x) == ErrorCode::NEGATIVE_NUMBER)
    {
        cout << "You entered a negative number!\n";
    }
    else
    {
        cout << "It worked!\n";
    }
 
    return 0;
}