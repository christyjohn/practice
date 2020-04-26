#include <iostream>

using namespace std;

int main() 
{
    int A[5] = {3, 4, 10, 12, 5};
    int A2[5] = {3, 4};
    
    for (int i = 0 ; i <5; ++i)
        cout << A[i] << " ";
    cout << endl;

    for (int i = 0 ; i <5; ++i)
        cout << A2[i] << " ";
    cout << endl;

    return 0;
}