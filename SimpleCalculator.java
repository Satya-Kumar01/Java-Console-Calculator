import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("🔢 Welcome to Java Console Calculator 🔢");

        while (keepRunning) {
            // Display menu
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Invalid choice. Please enter a number from 1 to 5.");
                continue;
            }

            if (choice == 5) {
                keepRunning = false;
                System.out.println("👋 Exiting calculator. Thanks for using it!");
                break;
            }

            // Get input numbers
            double num1, num2;
            try {
                System.out.print("Enter first number: ");
                num1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter second number: ");
                num2 = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Invalid input. Please enter valid numbers.");
                continue;
            }

            // Perform operation
            double result;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("✅ Result: " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("✅ Result: " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("✅ Result: " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    System.out.println("✅ Result: " + result);
                    break;
                default:
                    System.out.println("⚠️ Invalid selection. Try again.");
            }
        }

        scanner.close();
    }

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("🚫 Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
}