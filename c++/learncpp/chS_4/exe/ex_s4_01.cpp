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
    int age;
    cin >>  age;

    int namelength = name.length();
    //cout << namelength;
    double years_per_letter = (age / namelength);

    cout << "You've lived " << years_per_letter << " years for each letter in your name.\n";

    return 0;
}