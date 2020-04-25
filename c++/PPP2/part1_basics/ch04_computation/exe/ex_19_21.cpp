#include "../../lib_files/std_lib_facilities.h"

int main()
{
    vector<string> names;
    vector<int> marks;

    string name;
    int mark = -1;
    bool notpresent = true;

    while (name != "NoName")
    {
        cout << "Enter name, marks pair (eg: Christy 98): ";
        cin >> name >> mark;
        for (int i = 0; i < names.size(); ++i)
        {
            if (names[i] == name)
                notpresent = false;
        }
              
        if (notpresent && name != "NoName" )
        {
            names.push_back(name);
            marks.push_back(mark);
        }

        cout << "Do you like to continue? Enter 'NoName 0' to exit : \n";

    }

    for (int i = 0; i < names.size(); ++i)
    {
        cout << names[i] << " --> " << marks[i] << '\n';
    }

     cout << "Enter a name for which you need the marks: ";
    cin >> name;

    for (int i = 0; i < names.size(); ++i)
    {
        if (names[i] == name)
            cout << name << " got " << marks[i] << " marks." << '\n';
    }

    cout << "Enter a marks for which you need the list of students: ";
    cin >> mark;

    cout << "The list of students who got " << mark << " marks are: ";
    for (int i = 0; i < marks.size(); ++i)
    {
        if (marks[i] == mark)
            cout << names[i] << " " ;
    } 
    cout << '\n'; 
    return 0;
}