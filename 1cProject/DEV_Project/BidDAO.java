// package dao;

// import model.Bid;
import util.DatabaseConnection;

import java.sql.*;

public class BidDAO {
    public boolean placeBid(Bid bid) {
        String query = "INSERT INTO Bids (item_id, bidder_id, amount) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, bid.getItemId());
            stmt.setInt(2, bid.getBidderId());
            stmt.setDouble(3, bid.getAmount());
            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public double getHighestBid(int itemId) {
        String query = "SELECT MAX(amount) AS highest_bid FROM Bids WHERE item_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, itemId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getDouble("highest_bid");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0.0;
    }
}
