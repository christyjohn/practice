#include <iostream>
 
int main()
{
    char name[20]{ "Alex" }; // only use 5 characters (4 letters + null terminator)
    std::cout << "My name is: " << name << '\n';

    char name2[5]{ "Alex" }; // only use 5 characters (4 letters + null terminator)
    name2[5] = 'y';
    std::cout << "My name is: " << name2 << '\n';
 
    return 0;
}