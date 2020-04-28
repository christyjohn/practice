#include <iostream>
using namespace std;

class Parent 
{
    private: int a;
    protected: int b;
    public: int c;

        void funParent()
        {
            a = 10;
            b = 5;
            c = 15;
        }
};

class Child : public Parent
{
    public:
        void funChild()
        {
            //a = 10; // inaccessible
            b = 5;
            c = 15;
        }
};

class ProtectedChild : public Parent
{
    protected:

    public:
        void funChild()
        {
            //a = 10; // inaccessible
            b = 5;
            c = 15;
        }
};

class PrivateChild : public Parent
{
    public:
        void funChild()
        {
            //a = 10; // inaccessible
            b = 5;
            c = 15;
        }
};

class GrandChild : public Child
{
    protected:

    public:
        void funChild()
        {
            //a = 10; // inaccessible
            b = 5;
            c = 15;
        }
};

class ProtectedGrandChild : protected ProtectedChild
{
    protected:

    public:
        void funChild()
        {
            //a = 10; // inaccessible
            b = 5;
            c = 15;
        }
};

class PrivateGrandChild : private PrivateChild
{
    protected:

    public:
        void funChild()
        {
            //a = 10; // inaccessible
            //b = 5;
            //c = 15;
        }
};

int main()
{
    Child c;
    //c.a = 10;
    //c.b = 10;
    c.c = 15;

    ProtectedChild c1;
    //c1.a = 10;
    //c1.b = 10;
    c1.c = 15;

    PrivateChild c2;
    //c2.a = 10;
    //c2.b = 10;
    c2.c = 15;

    PrivateChild c3;
    //c3.a = 10;
    //c3.b = 10;
    c3.c = 15;

    GrandChild c4;
    //c4.a = 10;
    //c4.b = 10;
    c4.c = 15;

    ProtectedGrandChild c5;
    //c5.a = 10;
    //c5.b = 10;
    //c5.c = 15;

    PrivateGrandChild c6;
    //c.a = 10;
    //c.b = 10;
    //c6.c = 15;

    return 0;
}