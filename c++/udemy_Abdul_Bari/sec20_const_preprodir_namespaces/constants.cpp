#include <iostream>

using namespace std;

void fun(const int &a, int & b);

class Demo
{
public:
    int x = 10;
    int y = 20;

    void display() const
    {
       // x++;
        cout << x << ", " << y << endl;
    }
};

int main() 
{
    const int x = 10;
    int const y = 20;
    //++x;
    //++ y;

    const int z = 10;
    // int *ptr = &z;
    const int *ptr = &z;
    //++*ptr;

    int a = 10;
    int *ptr1 = &a;
    const int *ptr2 = &a; // same as int const *ptr2 = &a;
    //++*ptr2; // expression must be a modifiable lvalue
    ++ptr2;

    int b = 20;
    int const *ptr3 = &b; // constant integer pointer, value is constant. pointer is not
    ++ptr3;
    //++*ptr3;   // expression must be a modifiable lvalue

    int * const ptr4 = &b; // pointer is constant, value can change
    //++ptr4;
    ++*ptr4;

    const int * const ptr5 = &b;
    //++ptr5;
    //++*ptr5;

    Demo d;
    d.display();

    int c = 30;
    int e = 40;

    fun(c, e);
    cout << "Main: " << c << ", " << e << endl;;

	return 0;
} 

void fun(const int &a, int &b)
{
    cout << a << ", " << b << endl;;
    //a++;
    b++;
}