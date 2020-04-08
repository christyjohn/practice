// Note: this solution is the non-C++11 solution using a regular enum, not an enum class
#include <iostream>
#include <string>
 
enum Animal
{
    ANIMAL_PIG,
    ANIMAL_CHICKEN,
    ANIMAL_GOAT,
    ANIMAL_CAT,
    ANIMAL_DOG,
    ANIMAL_OSTRICH
};
 
std::string getAnimalName(Animal animal)
{
    switch (animal)
    {
        case ANIMAL_CHICKEN:
            return "chicken";
        case ANIMAL_OSTRICH:
            return "ostrich";
        case ANIMAL_PIG:
            return "pig";
        case ANIMAL_GOAT:
            return "goat";
        case ANIMAL_CAT:
            return "cat";
        case ANIMAL_DOG:
            return "dog";
 
        default:
            return "???";
    }
}
 
void printNumberOfLegs(Animal animal)
{
    std::cout << "A " << getAnimalName(animal) << " has ";
 
    switch (animal)
    {
        case ANIMAL_CHICKEN:
        case ANIMAL_OSTRICH:
            std::cout << "2";
            break;
 
        case ANIMAL_PIG:
        case ANIMAL_GOAT:
        case ANIMAL_CAT:
        case ANIMAL_DOG:
            std::cout << "4";
            break;
 
        default:
            std::cout << "???";
            break;
    }
 
    std::cout << " legs.\n";
}
 
int main()
{
    printNumberOfLegs(ANIMAL_CAT);
    printNumberOfLegs(ANIMAL_CHICKEN);
 
    return 0;
}