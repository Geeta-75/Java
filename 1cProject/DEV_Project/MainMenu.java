import controller.UserController;
import controller.ItemController;
import controller.BidController;

public class MainMenu {
    public static void main(String[] args) {
        // Initialize controllers
        UserController userController = new UserController();
        ItemController itemController = new ItemController();
        BidController bidController = new BidController();

        // Display menu
        System.out.println("Welcome to the Auction Management System");
        System.out.println("1. Register User");
        System.out.println("2. List Item");
        System.out.println("3. Place Bid");

        // Handle user input
        // Call appropriate methods from controllers
    }
}

