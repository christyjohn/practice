#include <iostream>
using std::cout; using std::cin;

#include <string>
#include <string_view>

std::string_view askForName()
{
    cout << "What's your name?\n";

    // Use a std::string, because std::cin needs to modify it.
    std::string str{};
    cin >> str;

    // We're switching to std::string_view for demonstrative purposes only.
    // If you already have a std::string, there's no reason to switch to
    // a std::string_view.
    std::string_view view{ str };

    cout << "Hello " << view << '\n';

    return view;
} // str dies, and so does the string that str created.

int main()
{
    std::string_view view{ askForName() };

    // view is observing a string that already died.
    cout << "Your name is " << view << '\n'; // Undefined behavior
    
    return 0;
}
