package Encapsulation;

public class Car {
    private String model;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1900 && year <= 2022) {
            this.year = year;
            System.out.println(year);
        } else {
            throw new IllegalArgumentException("Invalid year");
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.getModel();
        c.setModel("Samsung");
        c.setYear(2024);
        
        
    }
}

