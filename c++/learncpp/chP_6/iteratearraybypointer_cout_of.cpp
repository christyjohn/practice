#include <iostream>
#include <iterator>  // for std::size
#include <algorithm>

bool isVowel(char ch)
{
    switch(ch)
    {
        case 'A':
        case 'a':
        case 'E':
        case 'e':
        case 'I':
        case 'i':
        case 'O':
        case 'o':
        case 'U':
        case 'u':
            return true;
        default:
            return false;
    }
}

int main()
{
    char name[]{ "Mollie "};
    auto numVowels{ std::count_if(std::begin(name), std::end(name), isVowel) };

    std::cout << name << " has "<< numVowels << " vowels.\n";

    return 0;
}