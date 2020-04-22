#include "std_lib_facilities.h"
int main() 
{
    int pennies, nickels, dimes, quarters, half_dollars, dollars;
    cout << "Enter the number of pennies you have: ";
    cin >> pennies; 
    cout << "Enter the number of nickels you have: ";
    cin >> nickels; 
    cout << "Enter the number of dimes you have: ";
    cin >> dimes; 
    cout << "Enter the number of quarters you have: ";
    cin >> quarters; 
    cout << "Enter the number of half dollars you have: ";
    cin >> half_dollars;
    cout << "Enter the number of dollars you have: ";
    cin >> dollars;

    int total_cents = (dollars * 100) + (half_dollars * 50) +  (quarters * 25) +
        (dimes * 10) +  (nickels * 5) + pennies;

    string pennie_tag, nickel_tag, dime_tag, quarter_tag, half_dollar_tag, dollar_tag;

    if (pennies < 2) 
        pennie_tag = " penny\n";
    else
        pennie_tag = " pennies\n";
    
    if (nickels < 2) 
        nickel_tag = " nickel\n";
    else
        nickel_tag = " nickels\n";
    
    if (dimes < 2) 
        dime_tag = " dime\n";
    else
        dime_tag = " dimes\n";

    if (quarters < 2) 
        quarter_tag = " quarter\n";
    else
        quarter_tag = " quarters\n";
        
    if (half_dollars < 2) 
        half_dollar_tag = " half dollar\n";
    else
        half_dollar_tag = " half dollars\n";

    if (dollars < 2) 
        dollar_tag = " dollar\n";
    else
        dollar_tag = " dollars\n";
    

    cout << "You have " << pennies << pennie_tag;
    cout << "You have " << nickels << nickel_tag;
    cout << "You have " << dimes << dime_tag;
    cout << "You have " << quarters << quarter_tag;
    cout << "You have " << half_dollars << half_dollar_tag;
    cout << "You have " << dollars << dollar_tag;
    cout << "The value of all your coins is " << total_cents << " cents.\n";

    dollars = total_cents / 100;
    pennies = total_cents % 100;

    cout << "You have $" << dollars << "." << pennies << '\n';
    return 0;
}