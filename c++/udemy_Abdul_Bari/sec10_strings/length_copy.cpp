	#include <iostream>
    #include <cstring>

	using namespace std;

	int main() 
	{
        char r[50] = "Hello";
        cout << strlen(r) << endl;

        char s1[20] = "Good ";
        char s2[10] = "Morning";


        strcat(s1, s2);
        cout << s1 << endl;

        char s3[20] = "Good ";
        strncat(s3, s2, 3);
        cout << s3 << endl;


        char s4[20] = "Good ";
        char s5[10] = "";
        strcpy(s5, s4);
        cout <<  s5 << endl;

        char s6[10] = "Morning";
        char s7[5] = "";
        strncpy(s7, s6 , 3);
        cout <<  s7 << endl;

		return 0;
	} 