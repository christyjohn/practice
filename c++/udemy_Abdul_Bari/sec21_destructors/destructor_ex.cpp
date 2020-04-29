#include <iostream>

using namespace std;

class Demo
{
public:
    int *p;
    Demo()
    {
        p = new int[10];
        cout << "Constructor of demo\n";
    }
    ~Demo()
    {
        delete[] p;
        cout << "Destrutor of demo\n";
    }
};

void fun()
{
    Demo d;
    Demo *p = new Demo();
    delete p;
}

int main() 
{
    fun();
	return 0;
} 