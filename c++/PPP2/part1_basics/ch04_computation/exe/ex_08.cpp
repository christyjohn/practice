#include "../../lib_files/std_lib_facilities.h"

long long square (int val)
{
    // cout << "square of " << val << " = " << val * val << '\n';
    return val * val;
}

int find_square_num (int val)
{
    int num_squares = 2;
    int num_rice = 2;
    //cout << val << '\n';
   /*  cout << "number of rice: " << num_rice << ", number of squares: " 
            << num_squares << '\n'; */
    while (num_rice <= val) {
        /* cout << "number of rice: " << num_rice << ", number of squares: " 
            << num_squares << '\n'; */
        num_rice = square(num_rice);
        ++num_squares;
    }
    return num_squares;    
}

int main()
{
    //find_square_num(1000);
    cout << "Number of squares needed for 1000 rice = " << find_square_num(1000) << '\n';
    //don't run these it will take some time
    //cout << "Number of squares needed for 1000000 rice = " << find_square_num(100000) << '\n';
    //cout << "Number of squares needed for 1000000000 rice = " << find_square_num(1000000000) << '\n';

    return 0;
}