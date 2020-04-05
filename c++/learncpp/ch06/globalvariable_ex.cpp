#include <iostream>
using std::cout;

// Variables declared outside of a function are global variables
int g_x {};

void doSomething()
{
    // global variables can be seen and used everywhere in the file
    g_x = 3;
    cout << g_x << '\n';
}

int main()
{
    doSomething();
    cout << g_x << '\n';

    // global variables can be seen and used everywhere in the file
    g_x = 5;

    cout << g_x << '\n';

    return 0;
}