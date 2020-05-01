/*
 *      Chris's Carper Cleaning Service 
 *      Charges $30 per room
 *      Sales tax rate is 60%
 *      Estimates are valid for 30 days
 * 
 *      Prompt the user for the number of rooms they would like cleaned
 *      and provide an estimate such as:
 * 
 *  Estimate for carper cleaning service:
 *  Number of rooms: 2
 *  Price per room: $30
 *  Cost: $60
 *  Tax: $3.6
 *  ===================================================
 *  Total estimate: $63.6
 *  This estimate is valid for 30 days
 */
 
#include  <iostream>
using namespace std;

int main()
{
    cout << "Hello, welcome to Chris's Carpet Cleaning Service" << endl;
    cout << endl;
    cout << "How many rooms would you like cleaned? ";
    
    int number_of_rooms {0};
    cin >> number_of_rooms;
    
    const double price_per_room {32.50};
    const double sales_tax {0.06};
    const int estimate_expiry {30}; // days
    
    cout << "\nEstimate for carpet cleaning service" << endl;
    cout << "Number of rooms: " << number_of_rooms << endl;
    cout << "Price per room: $" << price_per_room << endl;
    cout << "Cost : $" << price_per_room * number_of_rooms << endl;
    cout << "Tax: $" << price_per_room* number_of_rooms * sales_tax << endl;
    cout << "===================================================" << endl;
    cout << "Total estimate: $" << (price_per_room * number_of_rooms ) + (price_per_room* number_of_rooms * sales_tax) << endl;
    cout << "This estimate is valid for " <<  estimate_expiry << " days" << endl; 
    cout << endl;
    
    return 0;
}