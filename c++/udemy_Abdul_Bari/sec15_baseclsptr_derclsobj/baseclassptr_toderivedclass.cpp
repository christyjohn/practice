#include <iostream>
using namespace std;

class Base 
{
public:
    void fun1()
    {
        cout << "fun1 of Base" << endl;
    }

};

class Derived : public Base
{
public:
    void fun2()
    {
        cout << "fun2 of Derived" << endl;
    }
};

int main()
{
    Derived d;
    Base *ptr = &d;
    d.fun1();
    d.fun2();
    cout << "<------------>" << endl;
    ptr->fun1();
    //ptr->fun2();

    //Derived *ptr = new Base();
    Base b;
    //Derived *ptr = &b;

    return 0;
}