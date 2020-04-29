#include <iostream>

using namespace std;

class Outer
{
public:
    int a = 0;
    static int b;

    void func()
    {
        i.show();
    }

    class Inner
    {
    public:
        int x = 25;
        void show()
        {
            cout << "show\n";
            //cout << a;
            cout << b << endl; // static member, can access
        }
    };
    Inner i;
};

int main() 
{

	return 0;
} 