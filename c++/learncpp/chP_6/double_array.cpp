#include <iostream>
using std::cout;
 
int main()
{
    double array[3]; // allocate 3 doubles
    array[0] = 2.0;
    array[1] = 3.0;
    array[2] = 4.3;
 
    cout << "The average is " << (array[0] + array[1] + array[2]) / 3 << "\n";
 
    return 0;
}