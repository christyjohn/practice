#include <string>
using std::string;
#include <iostream>
using std::cout; using std::cin;using std::getline;

int main()
{
    cout << "Pick 1 or 2: ";
    int choice{};
    cin >> choice;

    cout << "Now enter your name: ";
    string name{};
    getline(cin , name);

    cout << "Hello, " << name << ", you picked " << choice << '\n'; 

    return 0;
}