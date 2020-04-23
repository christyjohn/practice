#include "../../lib_files/std_lib_facilities.h"

int main()
{
    int val1, val2;
    string term1, term2;

    cout << "Enter 'i' for int value 's' for string value\n";
    char format;
    cin >> format;

    if (format == 'i')
    {
        cout << "Enter 2 digit from 0 to 9 (including) \n";
        cin >> val1 >> val2;
    }    
    else if (format == 's')
    {
        cout << "Enter 2 digit from 0 to 9 (including) as term : eg 'three' \n";
        cin >> term1 >> term2;
        if (term1 == "zero" || term1 == "one" 
            || term1 == "two" || term1 == "three"
            || term1 == "four" || term1 == "five"
            || term1 == "six" || term1 == "seven"
            || term1 == "eight" || term1 == "nine"
            || term2 == "zero" || term2 == "one" 
            || term2 == "two" || term2 == "three"
            || term2 == "four" || term2 == "five"
            || term2 == "six" || term2 == "seven"
            || term2 == "eight" || term2 == "nine")
        {
            if (term1 == "zero")
                val1 = 0;
            else if (term1 == "one")
                val1 = 1;
            else if (term1 == "two")
                val1 = 2;
            else if (term1 == "three")
                val1 = 3;
            else if (term1 == "four")
                val1 = 4;
            else if (term1 == "five")
                val1 = 5;
            else if (term1 == "six")
                val1 = 6;
            else if (term1 == "seven")
                val1 = 7;
            else if (term1 == "eight")
                val1 = 8;
            else if (term1 == "nine")
                val1 = 9;

            if (term2 == "zero")
                val2 = 0;
            else if (term2 == "one")
                val2 = 1;
            else if (term2 == "two")
                val2 = 2;
            else if (term2 == "three")
                val2 = 3;
            else if (term2 == "four")
                val2 = 4;
            else if (term2 == "five")
                val2 = 5;
            else if (term2 == "six")
                val2 = 6;
            else if (term2 == "seven")
                val2 = 7;
            else if (term2 == "eight")
                val2 = 8;
            else if (term2 == "nine")
                val2 = 9;
        }
        else
            cout << "Invalid number. Try again\n";            
    }
    else 
        cout << "Invalid format. Try again";

    cout << "Enter an operator (+, -, *, /)\n";
    char oper;
    cin >> oper;

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