package Progect_C;

public class CourseProvider {
    private int id;
    private String name;
    private long contact;
    private String password;

    public CourseProvider(int id, String name, long contact, String password) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.password = password;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public long getContact() { return contact; }
    public void setContact(long contact) { this.contact = contact; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
