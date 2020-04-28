#include <iostream>
using namespace std;

class Base
{
    private:
        int a;
    protected:
        int b;
    public:
        int c;

        void setA(int a)
        {
            this->a = a;
        }

        int getA()
        {
            return a;
        }
};

class Derived : public Base
{
    public:
        void funcDerived()
        {
            setA(5);
            b = 10;
            c = 15;
        }

        int getB()
        {
            return b;
        }
};

int main()
{
    Derived d;
    d.funcDerived();

    cout << d.getA() + d.getB() + d.c << endl;
    return 0;
}