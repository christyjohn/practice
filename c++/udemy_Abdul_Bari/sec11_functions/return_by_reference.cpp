	#include <iostream>

	using namespace std;

    int & fun(int &x)
    {
        x =  x * x;
        return x;
    }

	int main() 
	{
        int a = 10;
        cout << fun(a) << endl;
        fun(a) = 15;
        cout << fun(a) << endl;

		return 0;
	} 