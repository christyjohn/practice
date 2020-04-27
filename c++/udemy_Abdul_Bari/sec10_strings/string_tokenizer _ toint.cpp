	#include <iostream>
    #include <cstring>

	using namespace std;

	int main() 
	{
        char s1[10] = "235";
        char s2[10] = "54.78";

        long int x = strtol(s1, NULL, 10); // 10 is base
        float y = strtof(s2, NULL);

        cout << x << ", " << y << endl;
        cout << ++x << ", " << ++y << endl;

        char s3[20] = "x=10;y=20;z=30";
        //cout << strtok(s3, "=;") << endl; // only gives x

        char *token= strtok(s3, "=;");

        while (token != NULL)
        {
            cout << token << endl;
            token  = strtok(NULL, "=;");
        }

		return 0;
	} 