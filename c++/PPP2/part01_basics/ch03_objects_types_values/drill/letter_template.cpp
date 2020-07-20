#include "../std_lib_facilities.h"

int main()
{
    string first_name = "";
    cout << "Please enter your first name: ";
    cin >> first_name;
    cout << "Please enter your friend's name: ";
    string friend_name = "";
    cin >> friend_name;
    cout << "Is your friend male or female? (Enter 'm' or 'f'): ";
    char friend_sex;
    cin >> friend_sex;
    cout << "Please enter your age: ";
    int age = 0;
    cin >> age;


    cout << "Dear " << first_name << ",\n";
    cout << "\tHow are you? I am fine. I miss you.\n";
    cout << "\tHave you seen " << friend_name << " lateley?\n";

    if (friend_sex == 'm')
        cout << "\tIf you see " << friend_name << 
            " please ask him to call me.\n";
    else
        cout << "\tIf you see " << friend_name << 
            " please ask her to call me.\n";

    if (age <= 0 || age >= 110) {
        string content = "\n\tWhat!!! You are " + to_string(age) + " year old, you're kidding!";
        error(content);
    }
    else
        cout << "\tI hear you just had a birthday and you are " <<
         age  << " years old.\n";

    if (age < 12)
        cout << "\tNext year you will be " << age + 1;
    if (age == 17)
        cout << "\tNext year you will be able to vote.";
    if (age > 70)
        cout << "\tI hope you are enjoying retirement.";

    cout << "\nYour's sincerrely,\n\n Christy John\n";


     

    return 0;
}