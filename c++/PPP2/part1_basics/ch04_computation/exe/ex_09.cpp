#include "../../lib_files/std_lib_facilities.h"

long long square (long long val)
{
    // cout << "square of " << val << " = " << val * val << '\n';
    return val * val;
}

/* int find_square_num (int val)
{
    int num_squares = 2;
    int num_rice = 2;
    //cout << val << '\n';
    //  cout << "number of rice: " << num_rice << ", number of squares: " 
    //       << num_squares << '\n'; 
    while (num_rice <= val) {
    //    cout << "number of rice: " << num_rice << ", number of squares: " 
    //      << num_squares << '\n'; 
        num_rice = square(num_rice);
        ++num_squares;
    }
    return num_squares;    
} */

long long num_rice()
{
    int num_squares = 2;
    long long num_rice = 2;

    while (num_squares <= 64) {
        cout << "number of rice: " << num_rice << ", number of squares: " 
            << num_squares << '\n';
        num_rice = square(num_rice);
        ++num_squares;
    }
    return num_rice;  

}

int main()
{
    long long num_of_rice = num_rice();
    cout << num_of_rice << '\n';
    //cout << "Number of rice at square 64 = " << num_rice() << '\n';

    return 0;
}