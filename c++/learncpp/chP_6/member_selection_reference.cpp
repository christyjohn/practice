#include <iostream>

struct Person 
{
    int age;
    double weight;
};

int main()
{
    Person person;

    // Member selection using reference to struct
    Person &ref = person;

    ref.age = 5;

    std::cout << "person age: " << person.age << '\n';
    std::cout << "ref age: " << ref.age << '\n';

    return 0;
}