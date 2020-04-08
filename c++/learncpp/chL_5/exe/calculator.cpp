#include <iostream>
using std::cout; using std::cin;

int calculate(int x, int y, char op)
{
    switch(op)
    {
        case '+':
            return x + y;
        case '-':
            return x - y;
        case '*':
            return x * y;
        case '/':
            return x / y;
        case '%':
            return x % y;
        default:
            cout << "calculate(): Unhandled case\n";
            return 0; 
    }
}

int main()
{
    cout << "Enter an integer: ";
    int x;
    cin >> x;
 
    cout << "Enter another integer: ";
    int y;
    cin >> y;
 
    cout << "Enter a mathematical operator (+, -, *, /, or %): ";
    char op;
    cin >> op;
 
    cout << x << " " << op << " " << y << " is " << calculate(x, y, op) << "\n";

    return 0;
}