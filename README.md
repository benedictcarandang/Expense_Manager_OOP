# Expense Manager Application

## 📌 Project Overview
The **Expense Manager** is a console-based Java application designed to help users manage their expenses effectively. Users can add, view, and calculate the total of their expenses, categorized into **Food Expenses**, **Utility Expenses**, and **Entertainment Expenses**. Each category stores additional specific details, making the application flexible and easy to extend.

The program leverages the principles of Object-Oriented Programming (OOP) to create a clean, modular, and maintainable codebase.

---

## 🌟 Object-Oriented Programming Principles in Action

### 1. **Abstraction**
   - The `Expense` class acts as an abstract base class that defines the blueprint for all expense types.
   - Each expense type (`FoodExpense`, `UtilityExpense`, `EntertainmentExpense`) implements the abstract method `displayDetails()` to display category-specific details.
   - This hides unnecessary details from the user while ensuring essential information is handled properly.

### 2. **Encapsulation**
   - Fields such as `description`, `price`, and category-specific attributes (e.g., `mealType`, `utilityType`) are marked as `private` and accessed via **getter and setter methods**.
   - Data validation, such as non-negative prices in `setPrice()`, ensures the integrity of the stored data.

### 3. **Inheritance**
   - `FoodExpense`, `UtilityExpense`, and `EntertainmentExpense` inherit common properties (`description`, `price`) and behavior from the `Expense` superclass.
   - This reduces code redundancy and promotes reuse of common functionality.

### 4. **Polymorphism**
   - The program uses **runtime polymorphism** to call the appropriate `displayDetails()` method for each expense type.
   - For example, a single `viewExpenses()` method in `ExpenseManager` can handle all types of expenses dynamically.

---

## 🌍 Sustainable Development Goal (SDG): Goal 12 - Responsible Consumption and Production
This project aligns with **SDG 12**, which aims to ensure sustainable consumption and production patterns. By categorizing and monitoring their expenses, users are encouraged to:
- Reflect on their spending habits.
- Make informed decisions to minimize waste.
- Budget responsibly to promote financial and environmental sustainability.

The app fosters mindful consumption by helping users track and categorize their expenditures, ultimately contributing to responsible resource usage.

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- A code editor or IDE (e.g., IntelliJ IDEA, Eclipse, VS Code)

### How to Run
1. Type 1 to add expense.
2. Choose an expenses type if it is Food,Utility or Entertainment.
3. Enter description.
4. Enter price.
5. Choose meal type if it is Breakfast,Lunch or Dinner.
6. Type 2 to view expenses.
7. Type 3 if you want to calculate your expenses.
8. Type 4 if you want to exit.

## Video
[![Watch Video](https://img.shields.io/badge/Watch-Demonstration-blue?style=for-the-badge&logo=google-drive)](https://drive.google.com/file/d/1VU5sLuMIlm3kvF1QdJutMCsOULMrZ1Fe/view?usp=sharing)
