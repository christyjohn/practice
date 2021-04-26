package sec08.arrays_lists_boxing;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();
    
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
}
