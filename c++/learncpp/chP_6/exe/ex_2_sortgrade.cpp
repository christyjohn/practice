#include <algorithm> // std::sort
#include <cstddef>  // std::size_t
#include <string>
#include <vector>
#include <iostream>
using std::cin; using std::cout;

struct Student
{
    std::string name{};
    int grade{};
};

int getNumberOfStudents()
{
    int numberOfStudents{};

    do
    {
        cout << "How many students do you want to enter? ";
        cin >> numberOfStudents;
    } while (numberOfStudents <= 0);

    return numberOfStudents;
}

std::vector<Student> getStudents()
{
    using vector_type = std::vector<Student>;

    int numberOfStudents{ getNumberOfStudents() };

    // Create a vector with numberOfStudents elements.
    vector_type students(static_cast<vector_type::size_type>(numberOfStudents));

    int studentNumber{ 1 };

    for (auto &student : students)
    {
        cout << "Enter name #" << studentNumber << ": ";
        cin >> student.name;
        cout << "Enter grade #" << studentNumber << ": ";
        cin >> student.grade;

        ++studentNumber;
    }

    return students;
}

// Pass by reference to avoid slow copies. 
bool compareStudents(const Student &a, const Student &b)
{
    return (a.grade > b.grade);
}

int main()
{
    auto students{ getStudents() };

    std::sort(students.begin(), students.end(), compareStudents);

    // Print out all the names
    for (const auto &student : students)
    {
        std::cout << student.name << " got a grade of " << student.grade << '\n';
    }

    return 0;
}