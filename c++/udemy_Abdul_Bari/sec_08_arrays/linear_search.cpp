#include <iostream>

using namespace std;

int main() 
{
    int A[10], n = 10;

    cout << "Enter numbers: ";
    
    for (int i = 0; i < n; ++i)
        cin >> A[i];

    cout << "Enter the number to be searched: ";
    int key;
    cin >> key;

    bool found = false;
    for (int i = 0; i < n; ++i)
    {
        if (A[i] == key)
           found = true;
    }

    if (found)
        cout << "found\n";
    else
        cout << "not found\n";

    return 0;
}