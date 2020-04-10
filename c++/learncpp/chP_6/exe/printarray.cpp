#include <iostream>
using std::cout;

#include <iterator>

int main()
{
    int array[]{ 4,  6, 7, 3, 8, 2, 1, 9, 5 };
    int arrayLength{ static_cast<int>(sizeof(std::size(array)))};

    for (int index{ 0 }; index <= arrayLength; ++index)
        cout << array[index] <<  ' ';

    cout << '\n';

    return 0;
}