package sarapackage;
import java.util.Scanner;
public class Sara6 {
// SARA HACHECHE 
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("---- Calculator Menu ----");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Average");
	            System.out.println("0. Exit");

	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            if (choice >= 1 && choice <= 5) {
	                System.out.print("Enter the first number: ");
	                double num1 = scanner.nextDouble();
	                System.out.print("Enter the second number: ");
	                double num2 = scanner.nextDouble();

	                switch (choice) {
	                    case 1:
	                        System.out.println("Sum: " + sum(num1, num2));
	                        break;
	                    case 2:
	                        System.out.println("Difference: " + difference(num1, num2));
	                        break;
	                    case 3:
	                        System.out.println("Product: " + product(num1, num2));
	                        break;
	                    case 4:
	                        System.out.println("Division: " + division(num1, num2));
	                        break;
	                    case 5:
	                        System.out.println("Average: " + average(num1, num2));
	                        break;
	                }
	            } else if (choice != 0) {
	                System.out.println("Invalid choice. Please try again.");
	            }

	            System.out.println();
	        } while (choice != 0);

	        System.out.println("Exiting the calculator.");
	        scanner.close();
	}

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double difference(double num1, double num2) {
        return num1 - num2;
    }

    public static double product(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }
    public static double average(double num1, double num2) {
        return (num1 + num2) / 2;
    }
}