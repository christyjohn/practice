#include <iostream>
using std::cin; using std::cout;

double getDouble()
{
    while (true) // Loop until user enters a valid input
    {
        cout << "Enter a double value: ";
        double x;
        cin >> x;

        // Check for failed extraction
        if(cin.fail()) // has a previous extraction failed?
        {
            // yep, so let's handle the failure
            cin.clear(); // put us back in 'normal' operation mode
            cin.ignore(32767, '\n'); // and remove the bad input
            cout << "Oops, that input is invalid.Please try again.\n";
        } 
        else 
        {
            cin.ignore(32767, '\n'); // remove any extraneous input

            // the user can't enter a meaningless double value, 
            // so we don't need to worry about validating that

            return x;
        }
    }
}

char getOperator()
{
    while (true) // Loop until user enters a valid input
    {
        cout << "Enter one of the following: +, -, *, or /: ";
        char op;
        cin >> op;

        // Chars can accept any single input character, so no need to check 
        // for an invalid extraction here
        
        cin.ignore(32767,'\n'); // remove any extraneous input

        // Check whether the user entered meaningful input
        if (op == '+' || op == '-' || op == '*' || op == '/')    
            return op; // return it to the caller
        else // otherwise tell the user what went wrong
            std::cout << "Oops, that input is invalid.  Please try again.\n";
    } // and try again
}

void printResult(double x, char op, double y)
{
    if (op == '+')
        cout << x << " + " << y << " is " << x + y << '\n';
    else if (op == '-')
        cout << x << " - " << y << " is " << x - y << '\n';
    else if (op == '*')
        cout << x << " * " << y << " is " << x * y << '\n';
    else if (op == '/')
        cout << x << " / " << y << " is " << x / y << '\n';
    else // Being robust means handling unexpected parameters as well, even though getOperator() guarantees op is valid in this particular program
        cout << "Something went wrong: printResult() got an invalid operator.";
 
}

int main()
{
    double x = getDouble();
    char op = getOperator();
    double y = getDouble();
 
    printResult(x, op, y);
 
    return 0;
}