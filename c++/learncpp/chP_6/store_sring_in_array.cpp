#include <iostream>
using std::cout; using std::cin;

int main()
{
    char name[255]; // declare array large enough to hold 255 characters
    cout << "Enter your name: ";
    cin.getline(name, std::size(name));
    cout << "You entered: " << name << '\n';
      
    return 0;
}