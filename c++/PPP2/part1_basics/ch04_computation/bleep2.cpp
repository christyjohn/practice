#include "std_lib_facilities.h"

int main()
{
    string disliked0 = "Broccoli";
    string disliked1 = "potato";
    string disliked2 = "tomato";

    vector<string> words;
    for (string temp; cin >> temp;)
        words.push_back(temp);

    for (int i = 0; i < words.size(); i++) 
    {
        if (words[i] != disliked0 && words[i] != disliked1 && words[i] != disliked2)
            cout << words[i] << " ";
        else
            cout << "bleep! ";
        
    }
    cout << '\n';

    return 0;
}