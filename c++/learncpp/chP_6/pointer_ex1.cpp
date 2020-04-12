#include <iostream>
using std::cout;

int main()
{
    int v = 5;
    int *ptr= &v; // initialize ptr with address of variable v
    //int x = &v; // a value of type "int *" cannot be used to initialize an entity of type "int"
    //int *p = 5; // a value of type "int" cannot be used to initialize an entity of type "int *"
    //double *dPtr = 0x0012FF7C; // a value of type "int" cannot be used to initialize an entity of type "double *"

    int *ptr1{ new int (5) }; 
    int *ptr2{ new int {6} }; 
    cout << &v << '\n'; // print the address of variable 
    cout << ptr << '\n'; // print the address that ptr is holding
    cout << ptr1 << " " << *ptr1 << '\n';
    cout << ptr2 << " " << *ptr2 <<  '\n';

    return 0;  
}