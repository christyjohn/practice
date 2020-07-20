#include "../std_lib_facilities.h"

int main()
{
    int val1, val2, val3;
    cout << "Enter 3 integers: ";
    cin >> val1 >> val2 >> val3;

    int highest = 0,mid = 0,lowest = 0;

    lowest = val1;
    mid = val2;
    highest = val3;
    cout << lowest << " , " << mid << ", " << highest << "\n";

    if (val2 < val1 && val2 < val3) {
        lowest = val2;
        mid = val1;
    }
    else if (val3 < val1 && val3 < val2) {
        lowest = val3;
        highest = val1;
    }    

    if (highest < mid) {
        mid = mid + highest;
        highest = mid - highest;
        mid = mid - highest;
    }


    cout << lowest << ", " << mid << ", " << highest << "\n";

    return 0;
}