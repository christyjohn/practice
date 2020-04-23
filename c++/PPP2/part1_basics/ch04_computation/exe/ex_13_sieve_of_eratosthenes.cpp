#include "../../lib_files/std_lib_facilities.h"

void print_primes(int prime_upto) 
{
    bool primes[prime_upto + 1];

    for (int i = 2; i <= prime_upto; ++i)
    {
        primes[i] = true;
    }

    for(int p = 2; p * p <= prime_upto; ++p)
    {
        if(primes[p]) 
        {
            for(int j = p * p; j <= prime_upto; j += p)
                primes[j] = false;
        }
    } 

    // Print all prime numbers 
    for(int i = 2; i <= prime_upto; i++) 
    { 
        if(primes[i] == true) 
            cout << i << " "; 
    } 
    cout << '\n';
}

int main()
{
    cout << "Enter the number upto which to find prime : ";
    int prime_upto;
    cin >> prime_upto;

    cout << "Print primes upto " << prime_upto << '\n';
    print_primes(prime_upto);


    return 0;
}