#include <iostream>
using namespace std;

class Base
{
public:
    void display()
    {
        cout << "Display of Base" << endl;
    }

    virtual void display2(int x) = 0;
};

class Derived : public Base
{
public:
    void display2(int x)
    {
        cout << x << endl;
    }
};

int main()
{
    Derived d;
    d.display();
    d.display2(3);

    d.Base::display();

    return 0;
}
