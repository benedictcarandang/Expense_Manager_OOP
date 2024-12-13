// Subclass representing an EntertainmentExpense
public class EntertainmentExpense extends Expense {
    private String activityType; // e.g., Movie, Concert, Games

    public EntertainmentExpense(String description, double price, String activityType) {
        super(description, price);
        this.activityType = activityType;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Entertainment Expense: " + getDescription() + ", Price: " + getPrice() + ", Activity Type: " + activityType);
    }
}
