#include <cstdlib>
#include <iostream>
using std::cout;

void cleanup()
{
    // code here to do any kind of cleanup required
}

int main()
{
    cout << 1 << "\n";
    cleanup();

    exit(0); // terminate and return 0 to operating system
 
    // The following statements never execute
    std::cout << 2;
    return 0;
}