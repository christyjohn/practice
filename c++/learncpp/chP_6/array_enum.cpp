#include <iostream>
using std::cout;

enum class StudentNames
{
    KENNY, // 0
    KYLE, // 1
    STAN, // 2
    BUTTERS, // 3
    CARTMAN, // 4
    WENDY, // 5
    MAX_STUDENTS // 6
};

int main()
{
    int testScores[static_cast<int>(StudentNames::MAX_STUDENTS)];
    testScores[static_cast<int>(StudentNames::STAN)] = 76;

    cout << testScores[2] << "\n";

    return 0;
}