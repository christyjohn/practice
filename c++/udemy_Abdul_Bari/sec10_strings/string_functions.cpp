	#include <iostream>
    #include <string>

	using namespace std;

	int main() 
	{
        string s1 = "Hello";
        cout << s1.length() << endl;
        cout << s1.size() << endl;
        cout << s1.capacity() << endl;
        s1.resize(30);
        cout << s1.capacity() << endl;
        cout << s1.max_size() << endl;
        s1.clear(); // also s1.erase();
        if (s1.empty())
            cout << "empty\n";

        cout << "<=======================================>" << endl;

        s1 = "Hello";
        cout << s1.capacity() << endl;
        s1.append(" World!");
        cout << s1 << endl;
        cout << s1.capacity() << endl;
        s1.append(" can you please leave a message for me "
        "informing me the purpose of taking this course, Helo Hello"
        "so that I can guide you better and you can be benefited with the course.");
        cout << s1 << endl;
        cout << s1.capacity() << ", " << s1.length() << endl;

        cout << "<=======================================>" << endl;

        s1 = "Hello";
        s1.insert(3, "kk");
        cout << s1 << endl;
        s1.insert(3, "Apple", 2);
        cout << s1 << endl;
        s1.replace(3, 4, "Apple");
        cout << s1 << endl;

        cout << "<=======================================>" << endl;

        s1 = " programming";
        s1.push_back('H');
        // s1.push_back("H"); // error, only char
        cout << s1 << endl;
        s1.pop_back();
        s1.pop_back();
        cout << s1 << endl;

        s1 = "programming";
        string s2 = "Java";
        s1.swap(s2);
        cout << s1 << ", " << s2 << endl;

        cout << "<=======================================>" << endl;

        s1 = "programming";
        char str[10];
        s1.copy(str, 2);
        cout << str << endl;
        s1.copy(str, s1.length());
        cout << str << endl;

        cout << "<=======================================>" << endl;

        cout << s1.find('r') << endl;
        cout << s1.rfind('r') << endl; // find from reverse
        cout << s1.find('k') << endl;   // returns largest value
        s1 = "How are you?";
        cout << s1.find("are") << endl;

        cout << "<=======================================>" << endl;
        
        s1 = "programming";
        cout << s1.find_first_of('r') << endl;
        cout << s1.find_first_of("re") << endl; // ind either of
        cout << s1.find_first_of('r', 2) << endl;
        cout << s1.find_last_of('r', 2) << endl;
        cout << s1.find_last_of('r', 2) << endl;

        cout << "<=======================================>" << endl;

        cout << s1.substr(3) << endl;
        cout << s1.substr(3, 4) << endl;
        cout << s1.compare("hello") << endl;

        cout << "<=======================================>" << endl;
        cout << s1.at(4) << endl;
        cout << s1[4] << endl;
        cout << s1.front() << endl;
        cout << s1.back() << endl;


		return 0;
	} 