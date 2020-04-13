#include <array>
#include <numeric> // std::reduce
#include <iostream>

// We want to use ItemTypes to index an array. Use enum rather than enum class.
enum ItemTypes
{
  ITEM_HEALTH_POTION,
  ITEM_TORCH,
  ITEM_ARROW,
  MAX_ITEMS,
};

using inventory_type= std::array<int, ItemTypes::MAX_ITEMS>;

int countTotalItems(inventory_type items)
{
    return std::accumulate(items.begin(), items.end(), 0);
}

int main()
{
    inventory_type items{ 2, 5, 10 };

    std::cout << "The player has " << countTotalItems(items) << " item(s) in total.\n";
 
    // We can access individual items using the enumerators:
    std::cout << "The player has " << items[ItemTypes::ITEM_TORCH] << " torch(es)\n";
    
    return 0;
}
