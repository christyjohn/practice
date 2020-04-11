#include <iostream>
#include <string>

int main()
{
    char text[]{ "hello"};
    std::string str{ text };
    std::string more{ text };

    std::cout << text << ' ' << str << ' ' << more << '\n'; 

    return 0;
}