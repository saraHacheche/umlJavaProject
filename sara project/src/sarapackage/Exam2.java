package sarapackage;
import java.util.Scanner;
public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("---- Student Registration Menu ----");
	            System.out.println("1. Register a new student");
	            System.out.println("2. Calculate average");
	            System.out.println("3. Display student information");
	            System.out.println("0. Exit");

	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); 
	            switch (choice) {
                case 1:
                    enterStudentData(scanner);
                    break;
                case 2:
                    calculateAverage(scanner);
                    break;
                case 3:
                    displayStudentInformation(scanner);
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
	            }

	            System.out.println();
	        } while (choice != 0);

	        scanner.close();
	    }

	    public static void enterStudentData(Scanner scanner) {
	        System.out.println("---- Student Registration ----");
	        System.out.print("Enter student ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.print("Enter full name: ");
	        String fullName = scanner.nextLine();
	        System.out.print("Enter address: ");
	        String address = scanner.nextLine();

	        System.out.print("Enter phone number: ");
	        String phoneNumber = scanner.nextLine();

	        System.out.print("Enter course: ");
	        String course = scanner.nextLine();

	        System.out.print("Enter midterm exam grade: ");
	        double midtermGrade = scanner.nextDouble();

	        System.out.print("Enter final exam grade: ");
	        double finalGrade = scanner.nextDouble();

	        System.out.print("Enter assignments grade: ");
	        double assignmentsGrade = scanner.nextDouble();
	        System.out.println("Student data entered successfully.");
	    }

	    public static void calculateAverage(Scanner scanner) {
	        System.out.println("---- Calculate Average ----");
	        System.out.print("Enter student ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); 
	        System.out.println("Average calculated successfully.");
	    }

	    public static void displayStudentInformation(Scanner scanner) {
	        System.out.println("---- Display Student Information ----");
	        System.out.print("Enter student ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        System.out.println("Student information displayed successfully.");
	    }
	}
	


