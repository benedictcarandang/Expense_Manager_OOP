// Subclass representing a UtilityExpense

//encapsulation
//Inheritance
public class UtilityExpense extends Expense {
    private String utilityType; // e.g., Electricity, Water, Internet

    public UtilityExpense(String description, double price, String utilityType) {
        super(description, price);
        this.utilityType = utilityType;
    }

    public String getUtilityType() {
        return utilityType;
    }

    public void setUtilityType(String utilityType) {
        this.utilityType = utilityType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Utility Expense: " + getDescription() + ", Price: " + getPrice() + ", Utility Type: " + utilityType);
    }
}
