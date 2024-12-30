public class Dev {
    // Auction Management System - Java with SQL

// Database Connection Class
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;

// public class DatabaseConnection {
//     private static final String URL = "jdbc:mysql://localhost:3306/auction_db";
//     private static final String USER = "root";
//     private static final String PASSWORD = "password";

//     public static Connection getConnection() throws SQLException {
//         return DriverManager.getConnection(URL, USER, PASSWORD);
//     }
// }

// User Class
class User {
    private int userId;
    private String name;
    private String email;
    private String role;

    public User(int userId, String name, String email, String role) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
}

// User DAO Class
class UserDAO {
    public void addUser(User user) {
        String sql = "INSERT INTO Users (name, email, role) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getRole());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

// Item Class
class Item {
    private int itemId;
    private int auctioneerId;
    private String title;
    private String description;
    private double startingPrice;
    private String status;

    public Item(int itemId, int auctioneerId, String title, String description, double startingPrice, String status) {
        this.itemId = itemId;
        this.auctioneerId = auctioneerId;
        this.title = title;
        this.description = description;
        this.startingPrice = startingPrice;
        this.status = status;
    }

    public int getItemId() {
        return itemId;
    }

    public int getAuctioneerId() {
        return auctioneerId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public String getStatus() {
        return status;
    }
}

// Item DAO Class
class ItemDAO {
    public void addItem(Item item) {
        String sql = "INSERT INTO Items (auctioneer_id, title, description, starting_price, status) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, item.getAuctioneerId());
            stmt.setString(2, item.getTitle());
            stmt.setString(3, item.getDescription());
            stmt.setDouble(4, item.getStartingPrice());
            stmt.setString(5, "active");
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

// Bid Class
class Bid {
    private int bidId;
    private int itemId;
    private int bidderId;
    private double amount;

    public Bid(int bidId, int itemId, int bidderId, double amount) {
        this.bidId = bidId;
        this.itemId = itemId;
        this.bidderId = bidderId;
        this.amount = amount;
    }

    public int getBidId() {
        return bidId;
    }

    public int getItemId() {
        return itemId;
    }

    public int getBidderId() {
        return bidderId;
    }

    public double getAmount() {
        return amount;
    }
}

// Bid DAO Class
class BidDAO {
    public void placeBid(Bid bid) {
        String sql = "INSERT INTO Bids (item_id, bidder_id, amount) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, bid.getItemId());
            stmt.setInt(2, bid.getBidderId());
            stmt.setDouble(3, bid.getAmount());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean validateBid(int itemId, double bidAmount) {
        String sql = "SELECT MAX(amount) AS highestBid FROM Bids WHERE item_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, itemId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                double highestBid = rs.getDouble("highestBid");
                return bidAmount > highestBid;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

}
