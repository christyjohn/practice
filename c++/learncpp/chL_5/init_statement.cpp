#include <iostream>
using std::cout; using std::cin;
#include <string>
using std::string;

int main()
{
    string firstName{};
    string lastName{};

    cout << "First name: ";
    cin >> firstName;
 
    cout << "Last name: ";
    cin >> lastName;

    if (string fullName{ firstName + " " + lastName}; fullName.length() > 20)
    {
        std::cout << '"' << fullName << "\"is too long!\n";
    }
    else
    {
        std::cout << "Your name is " << fullName << '\n';
    }
 
    // code that doesn't need @fullName

    return 0;
}