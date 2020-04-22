#include "std_lib_facilities.h"

int main()
{   
    char alpha = 'a';
    while(alpha < char('z' + 1))
    {
        cout << alpha << '\t' << (int) alpha << '\n';
        ++alpha;
    }

    return 0;
}