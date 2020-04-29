#include <iostream>

using namespace std;

class Test
{
private: int a;
protected: int b;
public: int c;
    friend void fun();
};

void fun()
{
    Test t;
    // won't be able to access a and b without friend function declaration
    // also need an object as in t
    t.a = 10;
    t.b = 15;
    t.c = 20;
}

int main() 
{

	return 0;
} 