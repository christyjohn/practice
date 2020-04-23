#include "../../lib_files/std_lib_facilities.h"

int main()
{
    int low = 0;
    int high = 100;
    int guess = 0;
    int answer = 0;
    int step = 0;

    cout << "Guess a number from 0 to 100 (including): ";
    cin >> guess;

    while (answer != guess)
    {
        cout << "step : " << ++step << ", answer: " << answer << '\n';
        cout << "high: " << high << "low: " << low << '\n'; 
        
        if (answer == guess)
            break;
        if (guess < answer)
            high = answer - 1;
        else if (guess > answer)
            low = answer + 1;

        if (low <= high)
            answer = (int)(low + high) / 2;
    }
    cout << "answer: " << answer << '\n';
     
    return 0;
}