import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Class representing a customer order
class Order {
    private String productName;
    private int quantity;
    private double price;

    public Order(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public double getTotalAmount() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return productName + "," + quantity + "," + price;
    }

    // For displaying the order in a more readable format
    public String displayOrder() {
        return "Product: " + productName + ", Quantity: " + quantity + ", Price: " + price + ", Total: " + getTotalAmount();
    }

    // Static method to create an Order object from a line in the file
    public static Order fromString(String line) {
        String[] parts = line.split(",");
        return new Order(parts[0], Integer.parseInt(parts[1]), Double.parseDouble(parts[2]));
    }
}

public class OrderProcessingSystem {
    private static Map<String, Order> orders = new HashMap<>();
    private static final String FILE_NAME = "orders.txt";

    // Method to add a new order
    public static void addOrder(String productName, int quantity, double price) {
        orders.put(productName, new Order(productName, quantity, price));
        System.out.println("Order added for product: " + productName);
    }

    // Method to update an existing order
    public static void updateOrderQuantity(String productName, int newQuantity) {
        Order order = orders.get(productName);
        if (order != null) {
            order.updateQuantity(newQuantity);
            System.out.println("Order updated for product: " + productName);
        } else {
            System.out.println("Order not found for product: " + productName);
        }
    }

    // Method to display all orders
    public static void displayOrders() {
        System.out.println("Current Orders:");
        for (Order order : orders.values()) {
            System.out.println(order.displayOrder());
        }
    }

    // Method to save orders to a file (text-based)
    public static void saveOrdersToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Order order : orders.values()) {
                writer.write(order.toString());
                writer.newLine();  // Newline after each order
            }
            System.out.println("Orders saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to load orders from a file (text-based)
    public static void loadOrdersFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Order order = Order.fromString(line);
                orders.put(order.toString().split(",")[0], order); // Save the order in the map
            }
            System.out.println("Orders loaded from file.");
        } catch (FileNotFoundException e) {
            System.out.println("No saved orders found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loadOrdersFromFile();  // Load saved orders if available

        while (true) {
            System.out.println("\n1. Add Order\n2. Update Order Quantity\n3. Display Orders\n4. Save and Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.next();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter price per unit: ");
                    double price = scanner.nextDouble();
                    addOrder(productName, quantity, price);
                    break;

                case 2:
                    System.out.print("Enter product name to update: ");
                    String updateProduct = scanner.next();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    updateOrderQuantity(updateProduct, newQuantity);
                    break;

                case 3:
                    displayOrders();
                    break;

                case 4:
                    saveOrdersToFile();
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}
