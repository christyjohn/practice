#include <iostream>
using std::cin; using std::cout;

#include <iterator>

int main()
{
    // first read in valid input from user
    int number{};
    do
    {
        cout << "Enter a number between 1 and 9: ";
        cin >> number;
        // if the user entered an invalid character
        if (cin.fail())
            cin.clear(); // reset any error flags

        // ignore any extra characters in the input buffer (regardless of whether we had an error or not)
        cin.ignore(32767, '\n');

    } while (number < 1 || number > 9);
    
    // Next, print the array
    int array[]{ 4, 6, 7, 3, 8, 2, 1, 9, 5 };
    int arrayLength{ static_cast<int>(std::size(array)) };
 
    for (int index{ 0 }; index < arrayLength; ++index)
        std::cout << array[index] << ' ';
 
    std::cout << '\n';
 
    // Then, search the array to find the matching number and print the index
    for (int index{ 0 }; index < arrayLength; ++index)
    {
        if (array[index] == number)
        {
            std::cout <<  "The number " << number << " has index " <<  index << "\n";
            break; // since each # in the array is unique, no need to search rest of array
        }
    }
}

