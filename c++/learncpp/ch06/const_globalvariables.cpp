#include <iostream>
using std::cout;

const int g_y { 1 };
constexpr int g_z { 2 };

void doSomething()
{
    // global variables can be seen and used everywhere in the file
    cout << g_y << '\n';
    cout << g_z << '\n';
}

int main()
{
    doSomething();
 
    // global variables can be seen and used everywhere in the file
    cout << g_y << '\n';
    cout << g_z << '\n';
 
    return 0;
}