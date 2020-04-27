	#include <iostream>
    #include <string>

	using namespace std;

	int main() 
	{
        string email= "christy123@gmail.com";
        int i = (int)email.find('@');

        string uname = email.substr(0, i);

        cout << uname << endl;

		return 0;
	} 