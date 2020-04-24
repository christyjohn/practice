#include "../../lib_files/std_lib_facilities.h"
double some_function()
{
    double d = 0;
    cin >> d;
    if (!cin)
        error("couldn't read a double in 'some_function'");
    else
        cout << "All is well.";

    return d;
}

int main()
{
    some_function();

    return 0;
}