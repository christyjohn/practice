#include <iostream>
using namespace std;

class Base
{
public:
    void display()
    {
        cout << "Display of Base" << endl;
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
};

int main()
{
    Derived d;
    d.display();
    d.display(3);

    d.Base::display();

    return 0;
}
