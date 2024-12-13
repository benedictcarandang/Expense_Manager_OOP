// Subclass representing a FoodExpense
public class FoodExpense extends Expense {
    private String mealType; // e.g., Breakfast, Lunch, Dinner

    public FoodExpense(String description, double price, String mealType) {
        super(description, price);
        this.mealType = mealType;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Food Expense: " + getDescription() + ", Price: " + getPrice() + ", Meal Type: " + mealType);
    }
}
