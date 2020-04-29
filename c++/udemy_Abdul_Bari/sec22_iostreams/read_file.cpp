#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ifstream infile
    ;
    infile.open("my.txt");

    if (!infile.is_open())
        cout << "file cannot be opened.\n";

    string s;
    int x;

    infile >> s;
    infile >> x;

    cout << s << " " << x << endl;


    if (infile.eof())
        cout << "End of file reached!";
    
    infile.close();

    return 0;
}