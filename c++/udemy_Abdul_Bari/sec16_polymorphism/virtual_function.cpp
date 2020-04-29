#include <iostream>
using namespace std;

class Base
{
public:
    void display()
    {
        cout << "Display of Base" << endl;
    }
    virtual void display2()
    {
        cout << "Display2 of Base" << endl;
    }
};

class Derived : public Base
{
public:
    void display()
    {
        cout << "Display of Derived" << endl;
    } 

    void display(int x)
    {
        cout << x << endl;
    }
    void display2()
    {
        cout << "Display2 of Derived" << endl;
    }
};

int main()
{
    Base *ptr = new Derived();
    ptr->display();
    ptr->display2();

    return 0;
}
