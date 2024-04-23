package utsweek8;

import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockManager stockManager = new StockManager();

        // Adding initial items
        stockManager.addItem(new StockManager.Item("16030927", "Indomilk", "drink", 100));
        stockManager.addItem(new StockManager.Item("16100617", "Sprite", "drink", 70));
        stockManager.addItem(new StockManager.Item("16240401", "Yakult", "drink", 500));
        stockManager.addItem(new StockManager.Item("16270525", "Indomie", "food", 250));
        stockManager.addItem(new StockManager.Item("16971204", "Oreo", "food", 320));
        stockManager.addItem(new StockManager.Item("16100727", "Chocochips", "food", 120));
        stockManager.addItem(new StockManager.Item("16460329", "Ballpoint", "stationary", 75));
        stockManager.addItem(new StockManager.Item("16320421", "Pencil", "stationary", 110));
        stockManager.addItem(new StockManager.Item("16180729", "Book", "stationary", 57));

        while (true) {
            System.out.println("===========================================");
            System.out.println("++=====   Stock Management System   =====++");
            System.out.println("===========================================");
            System.out.println("1. Add Item");
            System.out.println("2. Display all Items");
            System.out.println("3. Sort Items based on stock");
            System.out.println("4. Display food Items with no stock");
            System.out.println("5. Search Item by name");
            System.out.println("6. Add stock for an Item");
            System.out.println("7. Decrease stock for an Item");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addItem(scanner, stockManager);
                    break;
                case 2:
                    stockManager.displayAllItems();
                    break;
                case 3:
                    stockManager.sortItemsByStock();
                    break;
                case 4:
                    stockManager.displayFoodItemsWithNoStock();
                    break;
                case 5:
                    searchItemByName(scanner, stockManager);
                    break;
                case 6:
                    addStock(scanner, stockManager);
                    break;
                case 7:
                    decreaseStock(scanner, stockManager);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 8.");
                break;
            }
            break;
        }
    }

    // Method Adding Item in Main 
    public static void addItem(Scanner scanner, StockManager stockManager) {
        System.out.println("===========================================");
        System.out.println("++           ADDING A NEW ITEM           ++");
        System.out.println("===========================================");
        System.out.print("Item Code: ");
        String itemCode = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Category: ");
        String category = scanner.nextLine();
        System.out.print("Stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        stockManager.addItem(new StockManager.Item(itemCode, name, category, stock));
        System.out.println("===========================================");
        System.out.println("++        ITEM ADDED SUCCESSFULLY        ++");
        System.out.println("===========================================");
    }

    public static void searchItemByName(Scanner scanner, StockManager stockManager) {
        System.out.println("===========================================");
        System.out.println("++      ENTER NAME KEYWORD TO SEARCH     ++");
        System.out.println("===========================================");
        String keyword = scanner.nextLine();
        stockManager.searchItemByName(keyword);
    }

    // Method Continue of Adding Stock
    public static void addStock(Scanner scanner, StockManager stockManager) {
        System.out.println("===========================================");
        System.out.println("++            ENTER ITEM CODE            ++");
        System.out.println("===========================================");
        String itemCode = scanner.nextLine();
        System.out.print("Enter quantity to add: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        stockManager.addStock(itemCode, quantity);
    }

    // Method Continuos of Decreasing Stock
    public static void decreaseStock(Scanner scanner, StockManager stockManager) {
        System.out.println("===========================================");
        System.out.println("++            ENTER ITEM CODE            ++");
        System.out.println("===========================================");
        String itemCode = scanner.nextLine();
        System.out.print("Enter quantity to decrease: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        stockManager.decreaseStock(itemCode, quantity);
    }
}
