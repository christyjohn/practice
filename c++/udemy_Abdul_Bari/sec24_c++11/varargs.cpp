#include <iostream>
#include <stdarg.h>

using namespace std;

int sum(int n, ...)
{
    va_list list;
    va_start(list, n);
    int sum = 0;
    for (int i = 0; i < n; i++)
        sum += va_arg(list, int);
    va_end(list);
    return sum;
}

int main() 
{
    cout << sum(9,3,4,5,6,7,8,9,1,10) << endl;
	return 0;
} 