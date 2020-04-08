#include <string>
using std::string;
#include <iostream>
using std::cout; using std::cin;

int main()
{
    cout << "Enter your full name: ";
    string name;
    cin >> name; // this won't work as expected since std::cin breaks on whitespace

    cout << "Enter your age: ";
    string age;
    cin >> age;

    cout << "Your name is " << name << " and your age is " << age << '\n';

    return 0;
}