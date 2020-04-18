#include <iostream>

int main()
{
    int favorite_number;    
    std::cout << "Enter your favorite number between 1 and 100: " << std::endl;    
    std::cin >> favorite_number;    
    std::cout << "Amazing!! That's my favorite number too!" << std::endl;  
    std::cout << "No Really!!, " << favorite_number << 
        " is my favorite number!" << std::endl;;  

    long people_on_earth {7'600'000'000};
    std::cout << "There are about " << people_on_earth << " people on earth." <<
        std::endl;
    return 0;
}
