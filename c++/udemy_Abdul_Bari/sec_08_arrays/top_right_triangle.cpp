#include <iostream>

using namespace std;

int main() 
{

    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            //cout << "j: " << j << ", i: " << i << " ";
            if (j >= i)
                cout << "*" << " ";
            else
                cout << "  ";
        }

        cout << endl;
    }

    return 0;
}