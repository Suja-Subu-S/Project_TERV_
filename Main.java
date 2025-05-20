import java.util.*;

class FoodItem {
    String name;
    double price;

    FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Restaurant {
    String name;
    List<FoodItem> menu = new ArrayList<>();

    Restaurant(String name) {
        this.name = name;
    }

    void addFoodItem(FoodItem item) {
        menu.add(item);
    }

    void showMenu() {
        System.out.println("Menu for " + name + ":");
        for (int i = 0; i < menu.size(); i++) {
            FoodItem item = menu.get(i);
            System.out.println((i + 1) + ". " + item.name + " - ₹" + item.price);
        }
    }
}

class Order {
    List<FoodItem> items = new ArrayList<>();
    String deliveryOption;
    String status = "Order Placed";

    void addItem(FoodItem item) {
        items.add(item);
    }

    double getTotal() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.price;
        }
        return total;
    }

    void trackOrder() {
        System.out.println("Order Status: " + status);
    }

    void setStatus(String status) {
        this.status = status;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a sample restaurant
        Restaurant rest1 = new Restaurant("Tasty Bites");
        rest1.addFoodItem(new FoodItem("Burger", 120));
        rest1.addFoodItem(new FoodItem("Pizza", 250));
        rest1.addFoodItem(new FoodItem("Pasta", 180));

        System.out.println("Welcome to the Online Food Delivery System!");

        // Show menu
        rest1.showMenu();

        // Take order
        Order order = new Order();
        while (true) {
            System.out.print("Enter item number to add to cart (0 to finish): ");
            int choice = sc.nextInt();
            if (choice == 0) break;
            if (choice >= 1 && choice <= rest1.menu.size()) {
                order.addItem(rest1.menu.get(choice - 1));
                System.out.println("Added to cart.");
            } else {
                System.out.println("Invalid choice.");
            }
        }

        // Delivery option
        System.out.print("Choose delivery option (Standard / Express): ");
        sc.nextLine(); // consume newline
        order.deliveryOption = sc.nextLine();

        // Show summary
        System.out.println("\nOrder Summary:");
        for (FoodItem item : order.items) {
            System.out.println("- " + item.name + " ₹" + item.price);
        }
        System.out.println("Delivery Option: " + order.deliveryOption);
        System.out.println("Total: ₹" + order.getTotal());

        // Simulate tracking
        System.out.println("\nTracking Order...");
        order.trackOrder();
        order.setStatus("Out for Delivery");
        order.trackOrder();
        order.setStatus("Delivered");
        order.trackOrder();

        sc.close();
    }
}
 