#include <iostream>

void printArray(int* array, int length)
{
    // if user passed in a null pointer for array, bail out early!
    if (!array)
        return;

    for (int index=0; index < length; ++index)
        std::cout << array[index] << ' ';

    std::cout << '\n';
}

int main()
{
    int array[6] = { 6, 5, 4, 3, 2, 1 };
    printArray(array, 6);
    
    return 0;
}