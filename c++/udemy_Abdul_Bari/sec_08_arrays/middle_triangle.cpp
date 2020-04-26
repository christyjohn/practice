#include <iostream>

using namespace std;

int main() 
{

    for (int i = 0; i < 4; ++i)
    {
        for (int j = 3; j >= 0; --j)
        {
            if (j <= i)
                cout << "*" << " ";
            else
                cout << " ";    
        }

        cout << endl;
    }

    return 0;
}