#include <iostream>

struct Employee
{
    short id;
    int age;
    double wage;
};
 
int main()
{
    std::cout << "The size of Employee is " << sizeof(Employee) << '\n';
 
    return 0;
}