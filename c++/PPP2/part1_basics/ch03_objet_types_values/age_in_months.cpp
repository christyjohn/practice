#include "std_lib_facilities.h"

int main()
{
    cout << "Please enter your fist name and age\n";
    string first_name = "???";
    int age = 0;
    cin >> first_name >> age;
    cout << "Hello, " <<  first_name << " (age " << age << ")\n";
    cout << "Age in months is " << age * 12 << endl;

    return 0;
}