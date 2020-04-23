#include "../../lib_files/std_lib_facilities.h"

int main()
{
    vector<string> digits{ "zero", "one", "two", "three", "four", "five",
        "six", "seven", "eight", "nine" };

    char input = 0;
    string number_term;
    int number;

    while (input != '|')
    {
        cout << "Enter 'i' for int value 's' for string value\n";
        char format;
        cin >> format;
        cout << "Enter a digit from 0 to 9 (including) :either as 3 or 'three' \n";

        if (format == 'i')
        {
            cin >> number;
            if (number >=0 && number <= 9)
                cout << digits[number]; 
        }    
        else if (format == 's')
        {
            cin >> number_term;
            if (number_term == "zero" || number_term == "one" 
                || number_term == "two" || number_term == "three"
                || number_term == "four" || number_term == "five"
                || number_term == "six" || number_term == "seven"
                || number_term == "eight" || number_term == "nine")
            {
                if (number_term == "zero")
                    cout << 0;
                else if (number_term == "one")
                    cout << 1;
                else if (number_term == "two")
                    cout << 2;
                else if (number_term == "three")
                    cout << 3;
                else if (number_term == "four")
                    cout << 4;
                else if (number_term == "five")
                    cout << 5;
                else if (number_term == "six")
                    cout << 6;
                else if (number_term == "seven")
                    cout << 7;
                else if (number_term == "eight")
                    cout << 8;
                else if (number_term == "nine")
                    cout << 9;
            }
            else
                cout << "Invalid number. Try again\n";            
        }
        else 
            cout << "Invalid format. Try again";

        cout << "\nDo you want to enter another digit: (enter '|' to exit: ";
        cin >> input;
    }

    return 0;
}