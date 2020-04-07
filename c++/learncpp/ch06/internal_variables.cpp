#include <iostream>

static int g_w { 3 }; // this separate internal g_x is only accessible within main.cpp

int main()
{
    std::cout << g_w << '\n';

    return 0;
}