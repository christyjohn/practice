#include <cstring>
#include <iostream>
using std::cin; using std::cout;

int main()
{
    // Ask the user to enter a string
    char buffer[255];
    cout << "Enter a string: ";
    cin >> getline(buffer, buffer.size());

    int spacesFound{ 0 };
    int bufferLength{ static_cast<int>(std::strlen(buffer)) };
    // Loop through all of the characters the user entered
    for (int index{ 0 }; index < bufferLength; ++index)
    {
        // If the current character is a space, count it
        if (buffer[index] == ' ')
            ++spacesFound;
    }
 
    std::cout << "You typed " << spacesFound << " spaces!\n";
 
    return 0;
}
