#include "../../lib_files/std_lib_facilities.h"

int main()
{
    char input = '0';
    int v1, v2;
    while(input != '|')
    {
        cout << "Input 2 integers" << '\n';
        cin >> v1 >> v2;
        if (v1 < v2 && v1 != v2)
        {
            cout << "The smallest is " << v1 << '\n';
            cout << "The largest is " << v2 << '\n';
        }
        else if (v1 > v2)
        {
            cout << "The smallest is " << v2 << '\n';
            cout << "The largest is " << v1 << '\n';
        }
        else 
            cout << "The numbers are equal.\n";        

        cout << "Continue? Enter any char. (To exit enter '|')" << '\n';
        cin >> input;
    }


    return 0;
}