#include <iostream>

using namespace std;

template<class T>

T minim(T a, T b)
{
    if (a < b)
        return a;
    else
        return b;        
} 

template<class T>

T maxim(T a,T b)
{
    if(a>b)
        return a;
    else
        return b;
}
int  main()
{
    cout << minim(10,5) << endl;
    cout << minim(12.5f,17.3f) << endl;
    cout << maxim(10, 5) << endl;
    cout << maxim(2.3f, 4.5f) << endl;

    return 0;
}