#include "std_lib_facilities.h"

int main()
{   
    char alpha = 'a';
    for (int i = alpha; alpha <= char('z'); ++alpha)
        cout << alpha << '\t' << (int) alpha << '\n';

    return 0;
}