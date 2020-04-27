	#include <iostream>

	using namespace std;

	int main() 
	{
        char s[10] = "Hello,";
        char t[] = " Christy";
        char r[] = { 'H', 'i', '\0', 'p', 'p'};
        char u[] = { 65, 66, 67, 68, 0, 67, 68 };

        // char *v = "Hello,"; // ISO C++ forbids converting a string constant to ‘char*’
        string v = "Hello";

        cout << s << ", " << t << ", " << r << ", " << u << ", " << v << endl;

		return 0;
	} 