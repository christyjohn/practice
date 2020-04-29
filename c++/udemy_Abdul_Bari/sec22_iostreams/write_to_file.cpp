#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ofstream outfile("my.txt", ios::app);
    outfile << "Hello\n";
    //outfile("my.txt", ios::app);
    outfile << 3 << endl;

    return 0;
}