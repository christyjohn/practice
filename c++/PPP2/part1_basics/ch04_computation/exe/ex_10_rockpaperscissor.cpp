#include "../../lib_files/std_lib_facilities.h"

int main()
{
    vector<string> machine_choices = { "scissor", "paper","rock", "paper", 
        "scissor", "paper", "rock", "rock", "scissor", "paper",
        "scissor", "paper","rock", "paper"};

    string user_choice;

    cout << "Playing 'Rock, paper and scissors' against computer.\n";

    for (int i = 0; i < machine_choices.size(); ++i)
    {
        cout << "Enter your choice : ";

        cin >> user_choice;
        char choice;

        if (user_choice == "rock")
            choice = 'r';
        else if (user_choice == "paper")
            choice = 'p';
        else if (user_choice == "scissor")
            choice = 's';

        switch(choice) 
        {
            case 'r':
                if (machine_choices[i] == "rock")
                    cout << "tie\n";
                else if (machine_choices[i] == "paper")
                    cout << "you lose\n";
                else if (machine_choices[i] == "scissor")
                    cout << "you win\n";
                
                break;
            case 'p':
                if (machine_choices[i] == "rock")
                    cout << "you win\n";
                else if (machine_choices[i] == "paper")
                    cout << "tie\n";
                else if (machine_choices[i] == "scissor")
                    cout << "you lose\n";
                
                break;
            case 's':
                if (machine_choices[i] == "rock")
                    cout << "you lose\n";
                else if (machine_choices[i] == "paper")
                    cout << "you win\n";
                else if (machine_choices[i] == "scissor")
                    cout << "tie\n";
                
                break;
        }
    }

    return 0;
}