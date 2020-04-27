	#include <iostream>
    #include <cstring>

	using namespace std;

	int main() 
	{
        char s1[20] = "banana";
        char s2[20] = "banana";
        char s3[20] = "apple";
        cout << strcmp(s1, s2) << endl;
        cout << strcmp(s2, s3) << endl;
        cout << strcmp(s3, s2) << endl;        

		return 0;
	} 