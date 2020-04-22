#include "std_lib_facilities.h"

int main()
{
    string disliked = "Broccoli";

    vector<string> words;
    for (string temp; cin >> temp;)
        words.push_back(temp);

    for (int i = 0; i < words.size(); i++) 
    {
        if (words[i] != disliked)
            cout << words[i] << " ";
        else
            cout << "bleep! ";
        
    }
    cout << '\n';

    return 0;
}