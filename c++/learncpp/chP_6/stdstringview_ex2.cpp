#include <iostream>
using std::cout;

#include <string_view>

int main()
{
    std::string_view str{ "Trains are fast!" };

    cout << str.length() << '\n'; // 16
    cout << str.substr(0, str.find(' ')) << '\n'; // Trains
    cout << (str == "Trains are fast!") << '\n'; // 1

    // Since C++20
    /*
    cout << str.starts_with("Boats") << '\\n'; // 0
    cout << str.ends_with("fast!") << "\n"; // 1

    std::cout << str << '\n'; // Trains are fast!
    */
   
    return 0;
}