#include <iostream>

using namespace std;

int main() 
{
    int A[10], n = 10;

    cout << "Enter numbers: ";
    
    for (int i = 0; i < n; ++i)
        cin >> A[i];

    cout << "Enter the number to be searched: ";
    int key;
    cin >> key;
    int low = 1, high = 10;
    int mid;
    int step = 1;

    bool found = false;
    while (low < high)
    {
        mid = (low + high) / 2;
        cout << "key: " << key << " ";
        cout << "step: " << step++ << ", low: " << low << ", high: "
            << high << ", mid << " << mid << endl;
        if (key < A[mid])
        {
            high = mid - 1;
        }
        else if (key > A[mid])
        {
            low = mid + 1;
        }
        else if (key == A[mid]) {
            found = true;
            break;
        }
    }

    if (found)
        cout << "found\n";
    else
        cout << "not found\n";

    return 0;
}