#include <string>
using std::string;
#include <iostream>
using std::cout; using std::cin;using std::getline;

int main()
{
    cout << "Pick 1 or 2: ";
    int choice{};
    cin >> choice;

    cin.ignore(32767, '\n'); // ignore up to 32767 characters until a \n is removed

    cout << "Now enter your name: ";
    string name{};
    getline(cin , name);

    cout << "Hello, " << name << ", you picked " << choice << '\n'; 

    return 0;
}