	#include <iostream>
    #include <string>

	using namespace std;

	int main() 
	{
        string s1 = "WeLcOME";

        for (int i = 0; i < s1[i] != '\0'; i++)
        {
            if (s1[i] >= 65 && s1[i] <= 90)
                s1[i] = s1[i]+ 32;
        }

        cout << s1 << endl;

		return 0;
	} 