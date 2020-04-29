#include <iostream>

using namespace std;

int division(int a, int b);

class MyException : exception
{
public:
   
};

int main() 
{
    int a = 10, b = 0, c;

    try
    {
        c = division(a, b);
        cout << c << endl;
    }
    catch(const MyException& e)
    {
        std::cerr << "Division by zero: "  << endl;
    }
    
	return 0;
} 

int division(int x, int y)
{
    if ( y == 0)
        throw MyException();
    return x / y;    
}