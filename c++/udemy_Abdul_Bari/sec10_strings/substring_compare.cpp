	#include <iostream>
    #include <cstring>

	using namespace std;

	int main() 
	{
        char s1[20] = "programming";
        char s2[20] = "gram";
        cout << strstr(s1, s2) << endl;

        char s3[20] = "king";
        if(strstr(s1, s3) != NULL)
            cout << strstr(s1, s3) << endl;
        else
            cout << "Not found\n";
        

		return 0;
	} 