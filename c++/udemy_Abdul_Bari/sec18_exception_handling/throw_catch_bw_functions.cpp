#include <iostream>

using namespace std;

int division(int a, int b);

int main() 
{
    int a = 10, b = 0, c;

    try
    {
        c = division(a, b);
        cout << c << endl;
    }
    catch(int e)
    {
        std::cerr << "Division by zero: error_code: " << e << '\n';
    }
    
	return 0;
} 

int division(int x, int y)
{
    if ( y == 0)
            throw 1;
       return x / y;    
}