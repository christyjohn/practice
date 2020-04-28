#include <iostream>
using namespace std;

class Base
{
    public:
        Base()
        {
            cout << "Default of Base" << endl;
        }

        Base (int x)
        {
            cout << "Param of base: " << x << endl;
        }
};

class Derived : public Base
{
    public:
        Derived()
        {
            cout << "Default of derived" << endl;
        }
        Derived(int a)
        {
            cout << "Param of Derived: " << a << endl;
        }

        Derived(int x, int a) : Base(x)
        {
            cout << "Param of base: " << x << endl;
            cout << "Param of Derived: " << a << endl;
        }
};

int main()
{
    Derived d;
    cout << "<------------------------>\n";
    Derived d2(3);
    cout << "<------------------------>\n";
    Derived d3(20, 30);

    return 0;
}