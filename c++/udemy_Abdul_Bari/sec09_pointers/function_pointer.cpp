	#include <iostream>

	using namespace std;

    void display()
    {
        cout << "Hello\n";
    }

    int max(int x, int y)
    {
        return x > y ? x : y;
    }

    int min(int x, int y)
    {
        return x < y ? x : y;
    }

	int main() 
	{
        void (*fp)();       // declaration
        fp = display;       // initialization
        (*fp)();            // function call

        int (*mp)(int, int);
        mp = max;
        int max = (*mp)(10, 5);
        cout << "max: " << max << endl;

		return 0;
	} 