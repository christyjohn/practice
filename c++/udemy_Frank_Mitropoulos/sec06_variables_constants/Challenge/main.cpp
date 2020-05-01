/*
 *      Chris's Carper Cleaning Service 
 *      Charges $25per small room
 *      Charges $30 per large room
 *      Sales tax rate is 60%
 *      Estimates are valid for 30 days
 * 
 *      Prompt the user for the number of rooms they would like cleaned
 *      and provide an estimate such as:
 * 
 *  Estimate for carper cleaning service:
 *  Number of small rooms: 3
 *  Number of large rooms: 1
 *  Price per small room: $25
 *  Price per large room: $30
 *  Cost: $110
 *  Tax: $6.6
 *  ===================================================
 *  Total estimate: $116.6
 *  This estimate is valid for 30 days
 */
 
#include  <iostream>
using namespace std;

int main()
{
    cout << "Hello, welcome to Chris's Carpet Cleaning Service" << endl;
    cout << endl;
    cout << "How many small rooms would you like cleaned? ";
    
    int number_of_small_rooms {0};
    cin >> number_of_small_rooms;    
    
    cout << "How many large rooms would you like cleaned? ";
    
    int number_of_large_rooms {0};
    cin >> number_of_large_rooms;
    
    const double price_per_small_room {25.0};
    const double price_per_large_room {35.0};
    const double sales_tax {0.06};
    const int estimate_expiry {30}; // days
    
    cout << "\nEstimate for carpet cleaning service" << endl;
    cout << "Number of  small rooms: " << number_of_small_rooms << endl;
    cout << "Number of large rooms: " << number_of_large_rooms << endl;
    cout << "Price per small room: $" << price_per_small_room << endl;
    cout << "Price per large room: $" << price_per_large_room << endl;
    double price_small_rooms = price_per_small_room * number_of_small_rooms;
    double price_large_rooms = price_per_large_room * number_of_large_rooms;
    double total_price = price_small_rooms + price_large_rooms;
    double tax = total_price * sales_tax ;
    cout << "Cost : $" << total_price << endl;
    cout << "Tax: $" << tax << endl;
    cout << "===================================================" << endl;
    cout << "Total estimate: $" << total_price + tax << endl;
    cout << "This estimate is valid for " <<  estimate_expiry << " days" << endl; 
    cout << endl;
    
    return 0;
}