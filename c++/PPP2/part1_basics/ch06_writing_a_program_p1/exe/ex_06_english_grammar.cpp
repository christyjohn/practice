#include "../../lib_files/std_lib_facilities.h"

// vectors of words, appropriately classified:
vector<string> nouns;
vector<string> verbs;
vector<string> conjunctions;

void init()
// initialize word classes
{
    nouns.push_back("birds");
    nouns.push_back("fish");

    verbs.push_back("rules");
    verbs.push_back("fly");
    verbs.push_back("swim");

    conjunctions.push_back("and");
    conjunctions.push_back("or");
    conjunctions.push_back("but");
}

bool is_noun(string w)
{
		for(int i = 0; i<nouns.size(); ++i)
			if (w==nouns[i]) return true;
		return false;
}

bool is_verb(string w)
{
		for(int i = 0; i<verbs.size(); ++i)
			if (w==verbs[i]) return true;
		return false;
}

bool is_conjunction(string w)
{
		for(int i = 0; i<conjunctions.size(); ++i)
			if (w==conjunctions[i]) 
				return true;
		return false;
}

bool sentence()
{
	cout << "sentence\n";
	string w;
	cin >> w;
	cout << w;
	if (!is_noun(w)) 
		return false;

	string w2;
	cin >> w2;
	cout << w2;
	if (!is_verb(w2)) 
		return false;

	string w3;
	cin >> w3;
	cout << w3;
	if (w3 == ".") 
		return true;	// end of sentence

	if (!is_conjunction(w3)) 
		return false;	// not end of sentence and not conjunction

	//cout << w << ", " << w2 << ", " << w3;

	return sentence();	// look for another sentence
}

int main()
try
{
	cout << "enter a sentence of the simplified grammar (terminated by a dot):\n";

	init();	// initialize word tables

	while (cin) {
			bool b = sentence();
			if (b)
				cout << "OK\n";
			else
				cout << "not OK\n";
			cout << "Try again: ";
	}
    return 0;
}
catch (runtime_error e) {	// this code is to produceerror messages; it will be described in Chapter 5
	cout << e.what() << '\n';
    return -1;
}