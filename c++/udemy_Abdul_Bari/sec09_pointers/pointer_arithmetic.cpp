#include<iostream>
using namespace std;

void PointerArith();

int main()
{
    PointerArith();
    return 0;
}
void PointerArith()
{
    int A[]={2,4,6,8,10,12};
    int *p=A;
    
    p++;
    
    cout << "*p = " << *p << endl;
    
    p=p+3; // pointer will be pointing on 10

    cout << "p = " << p << endl;
    
    cout << "p + 3 = " << p + 3 << endl;
    cout << "p - 3 = " << p - 3 << endl;
}