#include <iostream>
using std::cout;

int main()
{
    int outer = 1;
    while (outer <= 5)
    {
        // loop between 1 and outer
        int inner = 1;
        while (inner <= outer)
            cout << inner++ << ' ';

        // print a newline at the end of each row
        std::cout << '\n';
        ++outer;
    }
}