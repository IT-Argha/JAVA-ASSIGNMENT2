// Q: 5
// AUTHOR: ARGHA DIGAR
// TITLE: Restaurant Class
// DESCRIPTION: This Java program defines a Restaurant class with attributes for menu items, prices, and ratings, along with methods to add and remove items and calculate the average rating.
class Restaurant {
     String[] menuItems;
     double[] prices;
     int[] ratings;
     int itemCount;

    public Restaurant(int maxItems) {
        menuItems = new String[maxItems];
        prices = new double[maxItems];
        ratings = new int[maxItems];
        itemCount = 0;
    }

    // Add a menu item with its price and rating
    public void addItem(String menuItem, double price, int rating) {
        if (itemCount < menuItems.length) {
            menuItems[itemCount] = menuItem;
            prices[itemCount] = price;
            ratings[itemCount] = rating;
            itemCount++;
        } else {
            System.out.println("Maximum items limit reached. Item not added.");
        }
    }

    // Remove a menu item by its index
    public void removeItem(int index) {
        if (index >= 0 && index < itemCount) {
            for (int i = index; i < itemCount - 1; i++) {
                menuItems[i] = menuItems[i + 1];
                prices[i] = prices[i + 1];
                ratings[i] = ratings[i + 1];
            }
            menuItems[itemCount - 1] = null;
            prices[itemCount - 1] = 0.0;
            ratings[itemCount - 1] = 0;
            itemCount--;
        } else {
            System.out.println("Invalid index. Item not removed.");
        }
    }

    // Calculate the average rating of the restaurant
    public double calculateAverageRating() {
        if (itemCount == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int i = 0; i < itemCount; i++) {
            sum += ratings[i];
        }

        return (double) sum / itemCount;
    }

    // Display the menu items and their details
    public void displayMenu() {
        System.out.println("Menu Items:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Item: " + menuItems[i]);
            System.out.println("Price: $" + prices[i]);
            System.out.println("Rating: " + ratings[i] + " stars");
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(10);

        // Adding menu items with prices and ratings
        restaurant.addItem("Burger", 7.99, 4);
        restaurant.addItem("Pizza", 12.99, 5);
        restaurant.addItem("Salad", 6.49, 3);

        // Display the menu
        restaurant.displayMenu();

        // Calculate and display the average rating
        double averageRating = restaurant.calculateAverageRating();
        System.out.println("Average Rating: " + averageRating);

        // Remove a menu item by index
        restaurant.removeItem(1);

        // Display the updated menu
        restaurant.displayMenu();
    }
}
