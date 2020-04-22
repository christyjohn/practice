#include "std_lib_facilities.h"

int main()
{
    cout << "Please enter your friend's fist name and age\n";
    string first_name;
    int age;
    cin >> first_name;
    cin >> age;
    cout << "Pleae enter the first name of a friend: \n";
    string friend_name;
    cin >> friend_name;
    char friend_sex = 0;
    cout << "Enter `m` if your fiend is male, or `f` is friend is female\n";
    cin >> friend_sex;

    cout << "Dear " <<  first_name << ", \n";
    cout << "    How are you? I am fine. I miss you.\n";
    cout << "Have you seen " << friend_name << " lately? ";

    if (friend_sex == 'm')
        cout << "If you see " << friend_name << " please ask him to call me.\n";
    if (friend_sex == 'f')
        cout << "If you see " << friend_name << " please ask her to call me.\n";

    cout << "I hear you just had a birthday and you are " <<
         age << " years old.\n";

    if (age < 0 || age > 100)
        simple_error("you're kidding!");
    if (age < 12)
        cout << "Next year you will be " << age+1. << '\n';
    if (age ==  17)
        cout << "Next year you will be able to vote.\n";
    if ( age > 70)
        cout << "I hope you are enjoying retirement.\n";

    cout << "Yours sincerely\n\n\nChristy John\n";

    return 0;
}