#include <iostream>
#include <string>
using namespace std;

void employee_profile()
{
        int age {0};
        double hourly_wage {2350};
        string name;
        
        cout << "Enter name, age and hourly_wage: ";
        cin >> name >> age >> hourly_wage;
        cout << name << " " << age << " " << hourly_wage << endl;
}

int main()
{
    employee_profile();
    
    return 0;
}