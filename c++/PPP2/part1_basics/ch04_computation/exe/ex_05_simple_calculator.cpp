#include "../../lib_files/std_lib_facilities.h"

int main()
{
    double val1, val2;
    char oper;

    cout << "enter two double variables and an operator (+, -, *, /) : eg: 3.4 4.5 * : " << '\n';

    cin >> val1 >> val2 >> oper;

    switch(oper)
    {
        case '+':
            cout << val1 + val2 << '\n';
            break;
        case '-':
            cout << val1 - val2 << '\n';
            break;
        case '*':
            cout << val1 * val2 << '\n';
            break;
        case '/':
            cout << val1 / val2 << '\n';
            break;
        default:
            cout << "Please check your input\n";
            break;
    }

    return 0;
}