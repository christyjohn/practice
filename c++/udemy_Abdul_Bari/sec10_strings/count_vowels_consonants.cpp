	#include <iostream>
    #include <string>

	using namespace std;

	int main() 
	{
        int vowels = 0, consonants = 0, spaces = 0;
        string str = "how Many words";

        for (int i = 0; i < str[i] != '\0'; i++)
        {
            if (str[i] == 'A' || str[i] == 'E' || str[i] == 'I' ||str[i] == 'O' ||str[i] == 'U' ||
                str[i] == 'a' ||str[i] == 'e' ||str[i] == 'i' ||str[i] == 'o' ||str[i] == 'u')
                ++vowels;
            else if (str[i] == ' ')
                ++spaces;
            else 
                ++consonants;
        }

        cout << "Vowels: " << vowels << endl;
        cout << "Consonants: " << consonants << endl;
        cout << "Words: " << ++spaces << endl;

        cout << str << endl;

		return 0;
	} 