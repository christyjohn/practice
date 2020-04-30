#include <iostream>

using namespace std;

int main() 
{
    [](){ cout << "Hello\n"; }();
    auto f = [](){ cout << "Hello\n"; };
    [](int x, int y){ cout << x + y << endl; }(10, 5);
    int x = [](int x, int y){ return x + y; }(12, 23);
    cout << x << endl;
    f();

    int s = [](int x, int y)->int { return x + y; }(10, 15);
    cout << s << endl;

    int a = 3;
    int b = 5;
    [a, b](){cout << a << " " << b << endl; }();
    [&a, &b](){cout << ++a << " " << ++b << endl; }();
    //also. will access all the variables in the scope
    [&](){cout << ++a << " " << ++b << endl; }();

	return 0;
} 