#include <iostream>

using namespace std;

int main() 
{
    int A[5];
    int *p;
    p = A;
    int *q;
    q = new int(5);

    cout << p << ", " << q << endl;

    q[1] = 15;
    q[2] = 3;

    cout << q[1] << endl;

    delete []q; 

    cout << q[2] << endl;

    q = nullptr;

    return 0;
}