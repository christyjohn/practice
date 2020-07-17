#include "../std_lib_facilities.h"

int main()
{
    int dollars, halfdollars, quarters, dimes, nickels, pennies;

    cout << "Enter the number of pennies you have: ";    
    cin >> pennies;
    cout << "Enter the number of nickels you have: ";    
    cin >> nickels;
    cout << "Enter the number of dimes you have: ";    
    cin >> dimes;
    cout << "Enter the number of quarters you have: ";    
    cin >> quarters;
    cout << "Enter the number of halfdollars you have: ";    
    cin >> halfdollars;
    cout << "Enter the number of dollars you have: ";    
    cin >> dollars;

    int dollars_in_pennies = dollars * 100;
    int halfdollars_in_pennies = halfdollars * 50;
    int quarters_in_pennies = quarters * 25;
    int dimes_in_pennies = dimes * 10;
    int nickels_in_pennies = nickels * 5;

    int total_pennies = dollars_in_pennies + halfdollars_in_pennies + 
        quarters_in_pennies + dimes_in_pennies + nickels_in_pennies +
        pennies;

    cout << "The value of all your pennies is " << total_pennies << " \n";
    int dollar_value = total_pennies / 100;
    int cents = total_pennies % 100;
    cout << "The value is $" << dollar_value << "." << cents << "\n";
    return 0;
}