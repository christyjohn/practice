#include <iostream>
#include <string>
#include <string_view>

void print(std::string s)
{
    std::cout << s << '\n';
}

int main()
{
    std::string_view sv{ "balloon" };
    sv.remove_suffix(3);

    // print(sv); // compile error: won't implicitly convert

    std::string str {sv}; // explicit conversion

    print(str); // okay

    print(static_cast<std::string>(sv)); // okay

    return 0;
}
