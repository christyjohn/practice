#include "../../lib_files/std_lib_facilities.h"

int main()
{
    cout << "Enter a, b , and c of (ax^2 + bx + c = 0): ";
    double a, b, c, x1, x2;

    cin >> a >> b >> c;

    x1 = (-b + sqrt(b *b - 4 * a * c)) / (2 * a);
    x2 = (-b - sqrt(b *b - 4 * a * c)) / (2 * a);

    cout << "Solution of the quadratic equation is: " << x1 << " and " << x2 << '\n';

    return 0;
}