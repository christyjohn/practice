#include <algorithm> // std::sort
#include <iostream>
using std::cout; using std::cin;

#include <limits> // std::numeric_limits
#include <string>

int getNameCount()
{
    cout << "How many names would you like to enter? ";
    int length{};
    cin >> length; 

    return length;
}

// Asks user to enter all the names
void getNames(std::string* names, int length) 
{
    // Ignore the line feed that was left by std::cin.
    cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

    for (int i{ 0 }; i < length; ++i)
    {
        cout <<"Enter name #" << i + 1 << " : ";
        std::getline(cin, names[i]);
    }
}

// Prints the sorted names
void printNames(std::string*names, int length)
{
    cout << "\nHere is the sorted list:\n";

    for (int i{ 0 }; i < length; ++i)
        cout << "Name#" << i + 1 << " : " << names[i] << '\n'; 
}

int main()
{
    int length{ getNameCount() };

    // Allocate an array to hold the names
    auto* names{ new std::string[static_cast<std::size_t>(length)]{} };

    getNames(names, length);
 
    // Sort the array
    std::sort(names, names + length);
    
    printNames(names, length);

    // don't forget to use array delete
    delete[] names;
    // we don't need to set names to nullptr/0 here because it's going to go out
    // of scope immediately after this anyway.
    
    return 0;
}