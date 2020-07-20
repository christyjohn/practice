#include "../std_lib_facilities.h"

int main()
{
    string val1, val2, val3;
    cout << "Enter 3 names: ";
    cin >> val1 >> val2 >> val3;

    string highest,mid,lowest;

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
        string temp;
        temp = mid;
        mid = highest;
        highest = temp;
    }


    cout << lowest << ", " << mid << ", " << highest << "\n";

    return 0;
}