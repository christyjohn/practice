#include <iostream>

using namespace std;

int main() 
{
    int size;
    cout  << "Enter number of elements: ";
    cin >> size;
    int A[size];

    int *p = new int[size];
    cout << "Enter new size: ";
    cin >> size;
    delete []p;
    p = new int[size];

    cout << sizeof A << endl;

    return 0;
}