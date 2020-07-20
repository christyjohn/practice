#include "../std_lib_facilities.h"

int main()
{
    string operation;
    double operand1, operand2;

    cout << "Input an prefix operation (eg: + 2.3 4.5): ";
    cin >> operation >> operand1 >> operand2;

    if(operation == "+" || operation == "plus")
        cout << operand1 + operand2 << "\n";
    if(operation == "-" || operation == "minus")
        cout << operand1 + operand2 << "\n";
    if(operation == "*" || operation == "mul")
        cout << operand1 * operand2 << "\n";
    if(operation == "/" || operation == "div")
        cout << operand1 / operand2 << "\n";

    return 0;
}