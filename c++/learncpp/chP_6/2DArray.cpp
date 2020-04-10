#include <iostream>
using std::cout;

int main()
{
    constexpr int numRows{ 10 };
    constexpr int numCols{ 10 };

    // declare 10x10array
    int product[numRows][numCols]{};

    // Calculate a multiplication table
    for (int row{ 1 }; row < numRows; ++row)
        for (int col{ 1 }; col < numCols; ++col)
            product[row][col] = row * col;

    // print the table
    for (int row{ 1 }; row < numRows; ++row)
    {
        for (int col{ 1 }; col < numCols; ++col)
            cout << product[row][col] << '\t';
 
        cout << '\n';
    } 
 
    return 0;
}