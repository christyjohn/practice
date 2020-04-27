	#include <iostream>

	using namespace std;

	int main() 
	{
        char s[20];
        cout << "Enter a name: ";
        cin >> s;
        cout << "name is " << s << endl;
        getchar();

        char t[50];
        cout << "Enter another name (full name): ";
        cin.get(t, 50);
        cout << "name is " << t << endl;
        cin.ignore();

        char u[50];
        cout << "Enter another name (full name): ";
        cin.getline(u, 50);
        cout << "name is " << u << endl;
		return 0;;
	} 