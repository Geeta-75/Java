public class Item {
    private int itemId;
    private int auctioneerId;
    private String title;
    private String description;
    private double startingPrice;
    private String status;

    // Getters and Setters
    public int getItemId() { return itemId; }
    public void setItemId(int itemId) { this.itemId = itemId; }

    public int getAuctioneerId() { return auctioneerId; }
    public void setAuctioneerId(int auctioneerId) { this.auctioneerId = auctioneerId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getStartingPrice() { return startingPrice; }
    public void setStartingPrice(double startingPrice) { this.startingPrice = startingPrice; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}