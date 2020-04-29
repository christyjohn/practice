#include <iostream>

using namespace std;

class Base
{
public:
    Base()
    {
        cout << "Base constructor\n";
    }

    virtual ~Base()
    {
        cout << "Base destructor\n";
    }
};


class Derived : public Base
{
public:
    Derived()
    {
        cout << "Derived constructor\n";
    }

    ~Derived()
    {
        cout << "Derived destructor\n";
    }
};

int main() 
{
    //Derived d;

    Base *p = new Derived();
    delete p; // both Derived and  Base destructor is calleds

	return 0;
} 