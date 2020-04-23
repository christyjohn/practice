#include "../../lib_files/std_lib_facilities.h"

int main()
{
    vector<double> temps;
    for (double temp; cin >> temp;)
        temps.push_back(temp);

    // compuute mean temperature
    double sum = 0;
    for (double x : temps)
        sum += x;

    cout << "Size: " << temps.size() << '\n';
    cout << "Mid: " << temps.size() / 2 << '\n';
    cout << "Average temperature: " << sum/temps.size() << '\n';

    // compute median temperature
    sort(temps);
    double median = 0.0;
    if (temps.size() % 2 != 0)
        median = temps[(temps.size()/2)];
    else
        median = (temps[((temps.size()/2) - 1)] + temps[temps.size()/2]) /2;

    cout << "Median temperature: " << median << '\n';

    return 0;
}