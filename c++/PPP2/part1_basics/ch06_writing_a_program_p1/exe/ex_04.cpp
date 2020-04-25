#include "../../lib_files/std_lib_facilities.h"

//------------------------------------------------------------------------------

class Name_value
{
    public:
        string name;
        int marks;
    Name_value(string n, int m)
        :name(n), marks(m) { }
};

//------------------------------------------------------------------------------

int main()
{
    try
    {        
        vector<Name_value> name_values;

        string name = " ";
        int mark = -1;
        bool notpresent = true;

        while (name != "NoName")
        {
            cout << "Enter name, marks pair (eg: Christy 98): ";
            cin >> name >> mark;
            for (int i = 0; i < name_values.size(); ++i)
            {
                if (name_values[i].name == name)
                    notpresent = false;
            }

            if (notpresent && name != "NoName")
            {
                name_values.push_back(Name_value(name,mark));
            }

            cout << "Do you like to continue? Enter 'NoName 0' to exit : \n";

        }

        for (int i = 0; i < name_values.size(); ++i)
        {
            cout << name_values[i].name << " --> " << name_values[i].marks << '\n';
        }

        cout << "Enter a name for which you need the marks: ";
        cin >> name;

        for (int i = 0; i < name_values.size(); ++i)
        {
            if (name_values[i].name == name)
                cout << name << " got " << name_values[i].marks << " marks." << '\n';
        }
 
        cout << "Enter a marks for which you need the list of students: ";
        cin >> mark;

        cout << "The list of students who got " << mark << " marks are: ";
        for (int i = 0; i < name_values.size(); ++i)
        {
            if (name_values[i].marks == mark)
                cout << name_values[i].name << " " ;
        } 
        cout << '\n'; 
    }
    catch(const std::exception& e)
    {
        std::cerr << e.what() << '\n';
        keep_window_open("~");
    }
    catch (...) {	
        cout << "exiting\n";
        keep_window_open("~");
    }
    return 0;
}