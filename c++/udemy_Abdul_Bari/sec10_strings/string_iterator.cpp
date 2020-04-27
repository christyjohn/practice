	#include <iostream>
    #include<string>

	using namespace std;

	int main() 
	{
        string s1 = "Hello";
        string::iterator it;

        for(it = s1.begin(); it != s1.end(); it++)
            cout << *it << endl;

        cout << "<=======================================>" << endl;
        
        string::reverse_iterator rit;

        for(rit = s1.rbegin(); rit != s1.rend(); rit++)
            cout << *rit << endl;

		return 0;
	} 