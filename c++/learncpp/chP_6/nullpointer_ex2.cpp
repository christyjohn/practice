#include <iostream>
using std::cout;

//#include <cstddef> // for NULL

void print(int x)
{
    cout << "print(int): " << x << '\n'; 
}

void print(int* x)
{
    if(!x)
        cout << "print(int*): null\n";
    else
        cout << "print(int*): " << *x << '\n';
}

int main()
{
    int* x{ NULL };
    print(x); // calls print(int*) because x has type int*
	print(0); // calls print(int) because 0 is an integer literal
	//print(NULL); // likely calls print(int), although we probably wanted print(int*)
    print(nullptr); // calls print(int*) as desired

    return 0;
}

