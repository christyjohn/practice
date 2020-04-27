	#include <iostream>
    #include <cstring>

	using namespace std;

	int main() 
	{
        char s1[20] = "programming";
        char c = 'r';

        cout << strchr(s1, c) << endl; // rogramming
        cout << strrchr(s1, c) << endl; // find feom right/reverse - ramming

		return 0;
	} 