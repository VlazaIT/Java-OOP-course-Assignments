// Module 2.2 Task 1,2,3,4,5

package Module2.TaskSet2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, Double> itemCosts = new HashMap<>();
    private HashMap<String, List<String>> itemsByCategory = new HashMap<>();
    private HashMap<String, Integer> itemQuantities = new HashMap<>();

    private Map<String, ShoppingList> shoppingLists = new HashMap<>();

    public void createShoppingList(String purpose) {
        if (!shoppingLists.containsKey(purpose)) {
            shoppingLists.put(purpose, new ShoppingList(purpose));
            System.out.println("Created a new shopping list for: " + purpose);
        } else {
            System.out.println("A shopping list for " + purpose + " already exists.");
        }
    }

    public void addItem(String item, double cost) {
        if (!itemCosts.containsKey(item)) {
            itemCosts.put(item, cost);
            itemQuantities.put(item, 0); // Initialize quantity to 0
        } else {
            System.out.println(item + " is already in the list. No duplicate items allowed.");
        }
    }

    public void addItemWithCategory(String item, String category) {
        if (!itemsByCategory.containsKey(category)) {
            itemsByCategory.put(category, new ArrayList<>());
        }
        List<String> itemsInCategory = itemsByCategory.get(category);
        if (!itemsInCategory.contains(item)) {
            itemsInCategory.add(item);
            if (!itemCosts.containsKey(item)) {
                addItem(item, 0.0); // Assuming cost needs to be set separately
            }
        } else {
            System.out.println(item + " is already in the category " + category);
        }
    }

    public void addItemWithQuantity(String item, double cost, String category, int quantity) {
        addItemWithCategory(item, category);
        itemCosts.put(item, cost); // Set or update the cost
        itemQuantities.put(item, quantity); // Set or update the quantity
    }

    public void addItemToShoppingList(String purpose, String item, int quantity) {
        ShoppingList shoppingList = shoppingLists.get(purpose);
        if (shoppingList != null) {
            shoppingList.addItem(item, quantity);
            if (!checkItem(item)) { // If the item is not already in the global list, add it with default values.
                addItemWithQuantity(item, 0.0, "No category", quantity);
            }
        } else {
            System.out.println("No shopping list found for: " + purpose);
        }
    }

    public void updateQuantity(String item, int newQuantity) {
        if (itemQuantities.containsKey(item)) {
            itemQuantities.put(item, newQuantity);
        } else {
            System.out.println("Item " + item + " does not exist in the list.");
        }
    }

    public void removeItem(String item) {
        if (itemCosts.containsKey(item)) {
            itemCosts.remove(item);
            itemsByCategory.values().forEach(list -> list.remove(item));
            System.out.println(item + " was removed.");
        } else {
            System.out.println("Cannot remove " + item + " - item does not exist in the list.");
        }
    }

    public void removeItemFromShoppingList(String purpose, String item) {
        ShoppingList shoppingList = shoppingLists.get(purpose);
        if (shoppingList != null) {
            shoppingList.removeItem(item);
            // Note: This does not remove the item from the global list.
        } else {
            System.out.println("No shopping list found for: " + purpose);
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Map.Entry<String, Integer> entry : itemQuantities.entrySet()) {
            Double cost = itemCosts.get(entry.getKey());
            if (cost != null) {
                totalCost += cost * entry.getValue();
            }
        }
        return totalCost;
    }

    public void displayList() {
        int count = 1;
        for (Map.Entry<String, Double> entry : itemCosts.entrySet()) {
            System.out.println(count++ + ". " + entry.getKey() + " - €" + String.format("%.2f", entry.getValue()));
        }
    }

    public void displayByCategory(String category) {
        List<String> items = itemsByCategory.get(category);
        if (items != null && !items.isEmpty()) {
            System.out.println("Items in the category '" + category + "':");
            for (String item : items) {
                System.out.println(item + " - €" + String.format("%.2f", itemCosts.get(item))
                        + " - Quantity: " + itemQuantities.get(item));
            }
        } else {
            System.out.println("No items found in the category '" + category + "'.");
        }
    }

    public void displayAvailableItems() {
        System.out.println("Available items:");
        for (Map.Entry<String, Integer> entry : itemQuantities.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry.getKey() + " - Quantity: " + entry.getValue());
            }
        }
    }

    public void displayShoppingList(String purpose) {
        ShoppingList shoppingList = shoppingLists.get(purpose);
        if (shoppingList != null) {
            shoppingList.displayList();
        } else {
            System.out.println("No shopping list found for: " + purpose);
        }
    }

    public boolean checkItem(String item) {
        return itemCosts.containsKey(item);
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        manager.addItemWithQuantity("Milk", 1.50, "Dairy", 10);
        manager.addItemWithQuantity("Eggs", 2.50, "Dairy", 12);
        manager.addItemWithQuantity("Apples", 3.00, "Fruits", 5);

        manager.addItemWithQuantity("Apples", 3.00, "Fruits", 5);

        manager.displayList();

        manager.updateQuantity("Milk", 8);

        String specificItem = "Millk";
        System.out.print("Is " + specificItem + " in the grocery list? ");
        if (manager.checkItem(specificItem)) {
            System.out.println("Yeah, it is there.");
        } else System.out.println("No, the item is not in the list.");

        manager.removeItem(specificItem);

        System.out.println("The updated list is: ");
        manager.displayList();

        System.out.println("The total cost of the grocery list is: " + manager.calculateTotalCost() + " €.");

        manager.displayAvailableItems();


        System.out.println("\n--- Managing Shopping Lists ---");

        String birthdayParty = "Birthday Party";
        manager.createShoppingList(birthdayParty);

        manager.addItemToShoppingList(birthdayParty, "Cake", 1);
        manager.addItemToShoppingList(birthdayParty, "Candles", 10);
        manager.addItemToShoppingList(birthdayParty, "Balloon", 20);

        manager.displayShoppingList(birthdayParty);

        manager.removeItemFromShoppingList(birthdayParty, "Balloon");

        System.out.println("After removing balloons:");
        manager.displayShoppingList(birthdayParty);

        System.out.println("\nThe updated global list is: ");
        manager.displayList();
    }
}
