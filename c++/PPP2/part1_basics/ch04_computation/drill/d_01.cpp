#include "../std_lib_facilities.h"

int main()
{
    char input = '0';
    int v1, v2;
    while(input != '|')
    {
        cout << "Input 2 integers (To exit enter '|')" << '\n';
        cin >> v1 >> v2;
        cout << v1 << " " << v2 << '\n';
        cin >> input;
    }


    return 0;
}