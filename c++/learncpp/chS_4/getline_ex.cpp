#include <string>
using std::string;
#include <iostream>
using std::cout; using std::cin;using std::getline;

int main()
{
    cout << "Enter your full name: ";
    string name;
    getline(cin, name); 

    cout << "Enter your age: ";
    string age;
    getline(cin, age);

    cout << "Your name is " << name << " and your age is " << age << '\n';

    return 0;
}