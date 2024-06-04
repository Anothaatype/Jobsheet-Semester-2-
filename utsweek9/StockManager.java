package utsweek9;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class StockManager {

    // Item Attribute
    public static class Item {
        String itemCode;
        String name;
        String category;
        int stock;

    // Item Parametric Constructor
    public Item(String itemCode, String name, String category, int stock) {
            this.itemCode = itemCode;
            this.name = name;
            this.category = category;
            this.stock = stock;
        }

    public String toString() {
        return "Item Code: " + itemCode + ", Name: " + name + ", Category: " + category + ", Stock: " + stock;
        }
    }

    private List<Item> items;

    public StockManager() {
        items = new ArrayList<>();
    }

    // Method Adding Item in Class
    public void addItem(Item item) {
        items.add(item);
    }

    // Method Displaying All Items
    public void displayAllItems() {
        System.out.println("===========================================");
        System.out.println("++               ALL ITEMS               ++");
        System.out.println("===========================================");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("===========================================");
    }

    // Method Sorting Item by Stock 
    public void sortItemsByStock() {
        items.sort(Comparator.comparingInt(item -> item.stock));
        System.out.println("\nItems sorted by stock in ascending mode:");
        displayAllItems();
    }

    // Method Displaying Food Items that have no stock
    public void displayFoodItemsWithNoStock() {
        System.out.println("===========================================");
        System.out.println("++        FOOD ITEMS WITH NO STOCK       ++");
        System.out.println("===========================================");
        for (Item item : items) {
            if (item.category.equalsIgnoreCase("food") && item.stock == 0) {
                System.out.println(item);
            }
            else {  
            }
        }
        System.out.println("===========================================");
        System.out.println("++    THERE IS NO FOOD WITH NO STOCK     ++");
        System.out.println("===========================================");
    }
    
    // Metthod Search Item By Name
    public void searchItemByName(String keyword) {
        System.out.println("===========================================");
        System.out.println("++             SEARCH RESULTS            ++");
        System.out.println("===========================================");
        for (Item item : items) {
            if (item.name.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(item);
            }
        }
        System.out.println("===========================================");
    }

    // Method Adding A stock of an item 
    public void addStock(String itemCode, int quantity) {
        for (Item item : items) {
            if (item.itemCode.equals(itemCode)) {
                item.stock += quantity;
                System.out.println("===========================================");
                System.out.println("++       STOCK ADDED SUCCESSFULLY        ++");
                System.out.println("===========================================");
                return;
            }
        }
        System.out.println("===========================================");
        System.out.println("++            ITEM NOT FOUND             ++");
        System.out.println("===========================================");
    }

    // Method Decreasing a Stock of an item
    public void decreaseStock(String itemCode, int quantity) {
        for (Item item : items) {
            if (item.itemCode.equals(itemCode)) {
                if (item.stock >= quantity) {
                    item.stock -= quantity;
                    System.out.println("===========================================");
                    System.out.println("++     STOCK DECREASED SUCCESSFULLY      ++");
                    System.out.println("===========================================");
                } else {
                    System.out.println("===========================================");
                    System.out.println("++           INSUFFICIENT STOCK          ++");
                    System.out.println("===========================================");
                }
                return;
            }
        }
        System.out.println("===========================================");
        System.out.println("++            ITEM NOT FOUND             ++");
        System.out.println("===========================================");
    }
}


