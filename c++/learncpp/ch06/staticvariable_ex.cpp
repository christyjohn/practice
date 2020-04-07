#include <iostream>

void incrementAndPrint()
{
    // static duration via static keyword.  This initializer is only executed once.
    static int s_value{ 1 };
    ++s_value;
    std::cout << s_value << '\n';
} // s_value is not destroyed here, but becomes inaccessible because it goes out of scope

int main()
{
    incrementAndPrint();
    incrementAndPrint();
    incrementAndPrint();
 
    return 0;
}
