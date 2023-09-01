package sarapackage;
import java.util.Scanner;
public class Sara8 {
// SARA HACHECHE 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 10) {
            System.out.println(" The multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        } else {
            System.out.println("Invalid number . You hava to try again.");
        }
        scanner.close();
    }
}