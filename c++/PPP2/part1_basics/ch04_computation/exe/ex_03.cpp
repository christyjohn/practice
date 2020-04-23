#include "../../lib_files/std_lib_facilities.h"

int main()
{
    vector<double> distances;
    double median;

    for (double temp; cin >> temp;)
        distances.push_back(temp);

    sort(distances);

    cout << "smallest: " << distances[0] << '\n';
    cout << "largest: " << distances[distances.size() - 1] << '\n';
    
    if (distances.size() % 2 != 0)
        median = distances[(distances.size()/2)];
    else
        median = (distances[((distances.size()/2) - 1)] + distances[distances.size()/2]) /2;

    cout << "Median distance: " << median << '\n';

    return 0;
}