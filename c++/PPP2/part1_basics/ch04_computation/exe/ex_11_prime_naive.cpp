#include "../../lib_files/std_lib_facilities.h"

bool check_prime(int val)
{
    vector<int> primes = { 2,3,5,7,11,13,
            17,19,23,29,31,37,
            41,43,47,53,59,61,
            67,71,73,79,83,89, 97};
    
    bool prime = true;
    // cout << "check prime: prime_size - " << primes.size() << '\n';
    for (int i = 0; i < primes.size(); ++i)
    {
        if ( val % primes[i] == 0 ) {
            if (val == primes[i]) {
                prime == true;
                break;
            }
            else
                prime = false;
        }
    }
    //cout << "check prime: bool val - " << prime << '\n';

    return prime;
}

int main()
{
    vector<int> primes{};
    for (int i = 2; i < 100; ++i)
    {
        bool prime = check_prime(i);
            //cout << prime << '\n';

        if (prime)
            primes.push_back(i);
    }

    cout << "size of prime: " << primes.size() <<'\n';

    cout << "Primes below 100: ";
    for (int i = 0; i < primes.size(); ++i)
        cout << primes[i] << " ";
    cout << '\n';
}