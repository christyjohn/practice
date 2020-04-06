#include <iostream>
using std::cout;

int main()
{
    int apples { 5 };

    {
        cout << apples << '\n';

        int apples { 0 };

        apples = 10;

        cout << apples << '\n';
    }

    cout << apples << '\n';

    return 0;
}