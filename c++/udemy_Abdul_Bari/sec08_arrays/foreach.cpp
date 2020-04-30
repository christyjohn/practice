#include <iostream>

using namespace std;

int main() 
{
    int A[5] = {3, 4, 10, 12, 5};
    
    for (auto i : A)
        cout << i << " ";
    cout << endl;

    for (auto &i : A)
        cout << ++i << " ";
    cout << endl;


    for (auto i  : A)
        cout << i << " ";
    cout << endl;

    return 0;
}