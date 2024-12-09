// Abstract class representing an expense
public abstract class Expense {
    private String description;
    private double price;

    public Expense(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }



    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price must be non-negative.");
        }
    }

    // Abstract method for displaying expense details
    public abstract void displayDetails();
}
