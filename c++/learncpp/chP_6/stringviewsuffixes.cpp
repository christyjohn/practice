#include <cstring>
#include <iostream>
using std::cout;
#include <string_view>

int main()
{
    std::string_view str{ "Peach" };
    cout << str << '\n';

    // Ignore the first characters
    str.remove_prefix(1);

    cout << str << '\n';

    // Ignore the last 2 characters.
    str.remove_suffix(2);

    cout << str << '\n';
}