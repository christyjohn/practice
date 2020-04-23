#include "../../lib_files/std_lib_facilities.h"

int main()
{
    char input = '0';
    double value, smallest = 0, largest = 0;
    bool is_first = true;
    string unit;
    constexpr double mtrs_in_cm = .001;
    constexpr double mtrs_in_inch = 2.54 * mtrs_in_cm;
    constexpr double mtr_in_feet = 12 * mtrs_in_inch;

    vector<double> lengths;
    double sum = 0.0;
    double length_in_meters;

    while(input != '|')
    {
        cout << "Input a double and unit (eg: 2.5cm or 2.5 cm (ft and in available"  << '\n';
        cin >> value >> unit;

        if(unit != "" && ( unit != "cm" || unit != "ft" || unit != "in"|| unit != "mt"))
        {
             if (unit == "cm")
                length_in_meters = value * mtrs_in_cm;
             if (unit == "in")
                length_in_meters = value * mtrs_in_inch;
             if (unit == "ft")
                length_in_meters = value * mtr_in_feet;
             if (unit == "mt")
                length_in_meters = value;
        }

        sum += length_in_meters;
        lengths.push_back(length_in_meters);

        //cout << value << " ";

        if (value < smallest || is_first)
        {
            smallest = value;
            //cout << " smallest so far. ";
        }
        if (value > largest || is_first)
        {
            largest = value;
            //cout << " largest so far. ";
        }

        is_first = false;


        cout << "\nContinue? Enter any char. (To exit enter '|')" << '\n';
        cin >> input;
    }

    sort(lengths);

    for(int i = 0; i < lengths.size(); ++i)
        cout << lengths[i] << " ";

    cout << '\n';

    cout << "smallest: " << smallest << '\n';
    cout << "largest: " << largest << '\n';
    cout << "Total length: " << sum << '\n';


    return 0;
}