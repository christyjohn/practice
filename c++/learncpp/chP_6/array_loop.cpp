#include <iostream>
using std::cout;
#include <iterator> //for std:size

int main()
{
    int scores[] { 84, 92, 76, 81, 56 };
    int numStudents{ static_cast<int>(std::size(scores)) };

    int maxScore{ 0 }; // keep track of our largest score
    for (int student{ 0 }; student < numStudents; ++student)
        if (scores[student] > maxScore)
            maxScore = scores[student];

    cout << "Te best score was " << maxScore << '\n';

    return 0;
}