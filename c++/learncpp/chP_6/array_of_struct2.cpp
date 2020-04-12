#include <array>
#include <iostream>

struct House
{
    int number{};
    int stories{};
    int roomsPerStory{};
};

struct Array
{
    House value[3]{};
};

int main()
{
    Array houses {
        { { 13, 4, 30 },
          { 14, 3, 10 },
          { 15, 3, 40 } }
    };

    for (const auto &house : houses.value)
    {
        std::cout << "House number " << house.number
                  << " has " << (house.stories * house.roomsPerStory)
                  << " rooms\n";
    }


    return 0;
}