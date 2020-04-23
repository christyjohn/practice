#include "../../lib_files/std_lib_facilities.h"

int main()
{
    vector<int> series = { 3, 5, 3, 2, 2, 5, 1, 3, 6, 7, 6, 8, 2, 5, 2, 3 , 9, 0 };
    int max, min, mode;
    max = series[0];
    min = series[0];
    int current_max_count = 1;
    mode = series[0];

    for (int i = 0; i < series.size(); ++i)
    {
        int count = 1;

        for (int j = i + 1;j < series.size(); ++j)
        {
            if ( series[j] == series[i] )
                ++count;
            
            if ( series[j] < min )
                min =  series[j];
            
            if ( series[j] > max )
                max =  series[j];
        }

        if (count > current_max_count) {
            current_max_count = count;
            mode = series[i];
        }
    }

    cout << "min: " << min << ", max: " << max << ", mode: " << mode << '\n';

    return 0;
}