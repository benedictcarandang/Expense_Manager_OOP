import java.util.ArrayList;
import java.util.Scanner;

// Main class for managing expenses
public class ExpenseManager {
    private static ArrayList<Expense> expenses = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("===========================");
            System.out.println("     |Expense Manager|");
            System.out.println("===========================");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Calculate Total Expenses");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    viewExpenses();
                    break;
                case 3:
                    calculateTotalExpenses();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting Expense Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addExpense() {
        System.out.println("\nAdd Expense");
        System.out.println("1. Food Expense");
        System.out.println("2. Utility Expense");
        System.out.println("3. Entertainment Expense");
        System.out.print("Choose an expense type: ");
        int type = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline

        switch (type) {
            case 1:
                System.out.print("Enter meal type (Breakfast/Lunch/Dinner): ");
                String mealType = scanner.nextLine();
                expenses.add(new FoodExpense(description, price, mealType));
                break;
            case 2:
                System.out.print("Enter utility type (Electricity/Water/Internet): ");
                String utilityType = scanner.nextLine();
                expenses.add(new UtilityExpense(description, price, utilityType));
                break;
            case 3:
                System.out.print("Enter activity type (Movie/Concert/Games): ");
                String activityType = scanner.nextLine();
                expenses.add(new EntertainmentExpense(description, price, activityType));
                break;
            default:
                System.out.println("Invalid type. Expense not added.");
        }
    }

    private static void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
        } else {
            System.out.println("\nExpenses:");
            for (Expense expense : expenses) {
                expense.displayDetails(); // Polymorphic behavior
            }
        }
    }

    private static void calculateTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getPrice();
        }
        System.out.println("Total Expenses: PHP " + total);
    }
}
