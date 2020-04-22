#include "std_lib_facilities.h"

int main()
{
    cout << "Please enter a integer value:";
    int n;
    cin >> n;
    double d = n;
    cout << "n == " << n
         << "\nn + 1 == " << n + 1
         << "\nthree times n == " << 3 * n
         << "\nn twice n == " << n + n
         << "\nn squared == " << n * n
         << "\nhalfof n == " << n / 2
         << "\nsquare root of n == " << sqrt(d)
         << '\n';

    return 0;
}