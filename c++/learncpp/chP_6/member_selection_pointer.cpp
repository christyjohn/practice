#include <iostream>

struct Person
{
    int age;
    double weight;
};

int main()
{
    Person person;

    // Member selection using pointer to struct
    Person* ptr = &person;

    (*ptr).age = 5;
    ptr->weight = 25;

    std::cout << "person age: " << person.age << '\n';
    std::cout << "pointed age: " << (*ptr).age << '\n';
    std::cout << "pointed age: " << ptr->age << '\n';
    std::cout << "pointed weight: " << ptr->weight << '\n';

    return 0;
}