package sarapackage;
import java.util.Scanner;
public class Sar1 {
	// SARA HACHECHE 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the first integer value below 10");
		while (sum< 10) {
			System.out.println("Enter a number");
			int number = scanner.nextInt();
			if (number >= 10) {
		System.out.println("Invalid input ");
		continue;
			}
			sum += number;
			}
		System.out.println("sum reached 10,final sum is :"+ sum);
		scanner.close();
		
		}
		
		
		

	}


