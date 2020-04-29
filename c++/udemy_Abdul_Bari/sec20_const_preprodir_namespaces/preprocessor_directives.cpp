#include <iostream>

using namespace std;

#define PI 3.14159
//#define PI 3 // cannor redefine

#ifndef PI
    #definne PI 3
#endif

#define max(x, y) (x > y? x : y )

#define msg(x) #x

int main() 
{
    cout << PI << endl;
    cout << max(10, 12) << endl;
    cout << msg("Hello") << endl;

	return 0;
} 