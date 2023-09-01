package sarapackage;
import java.util.Scanner;
public class Sara7 {
 // SARA HACHECHE
	public static void main(String[] args) {
		 System.out.print("Enter a positive integer: ");
		 Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();

	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }

	        System.out.println("The sum of natural numbers  " + n + " is: " + sum);

	        scanner.close();
	    }
	}