#include "std_lib_facilities.h"

int main()
{
    cout << "Enter an operator(+, -, *, /) and two double operands (eg: + 45 23) : ";
    char oper;
    double val1, val2;

    cin >> oper >> val1 >> val2;

    if (oper == '+')
        cout << val1 + val2;
    else if (oper == '-')
        cout << val1 - val2;
    else if (oper == '*')
        cout << val1 * val2;
    else if (oper == '/')
        cout << val1 / val2;
    else 
        cout << "check input";

    cout << endl;

    return 0;
}