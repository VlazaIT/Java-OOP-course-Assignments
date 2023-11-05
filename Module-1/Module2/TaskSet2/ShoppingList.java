// Module 2.2 Task 5

package Module2.TaskSet2;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList {
    private String purpose;
    private Map<String, Integer> listItems;

    public ShoppingList(String purpose) {
        this.purpose = purpose;
        this.listItems = new HashMap<>();
    }
    public void addItem(String item, int quantity) {
        listItems.merge(item, quantity, Integer::sum);
    }

    public void removeItem(String item) {
        listItems.remove(item);
    }

    public void displayList() {
        System.out.println("This shopping list is for: " + purpose);
        if (listItems.isEmpty()) {
            System.out.println("This list is empty");
            return;
        }
        listItems.forEach((item, quantity) -> System.out.println(item + " - Quantity: " + quantity));
    }

    public String getPurpose() {
        return purpose;
    }

    public boolean hasItem(String item) {
        return listItems.containsKey(item);
    }

    public int getItemQuantity(String item) {
        return listItems.getOrDefault(item, 0);
    }
}
