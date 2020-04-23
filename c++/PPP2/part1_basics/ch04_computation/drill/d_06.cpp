#include "../../lib_files/std_lib_facilities.h"

int main()
{
    char input = '0';
    double value, smallest = 0, largest = 0;
    bool is_first = true;

    while(input != '|')
    {
        cout << "Input a double" << '\n';
        cin >> value;
        cout << value << " ";

        if (value < smallest || is_first)
        {
            smallest = value;
            cout << " smallest so far. ";
        }
        if (value > largest || is_first)
        {
            largest = value;
            cout << " largest so far. ";
        }

        is_first = false;

        cout << "\nContinue? Enter any char. (To exit enter '|')" << '\n';
        cin >> input;
    }


    return 0;
}