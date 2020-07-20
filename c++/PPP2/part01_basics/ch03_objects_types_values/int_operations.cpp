#include "std_lib_facilities.h"

int main()
{
    cout << "Please enter an integer value: ";
    int n;
    cin >> n;
    cout << "n == " << n
        << "\nn + 1 == " << n + 1
        << "\nthree times n == " << 3 * n
        << "\ntwice n == " << n + n
        << "\nn squared == " << n * n
        << "\nsquare root of n == " << sqrt((double)n) // gcc implicitly converts int to double, so cast is npt needed.
        << "\nreminder of n / 3 == " << n % 3
        << '\n';

    return 0;
}