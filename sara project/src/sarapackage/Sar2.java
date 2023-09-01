package sarapackage;
import java.util.Scanner;
public class Sar2 {
//SARA HACHECHE 
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int sum = 0;
	int number;
	System.out.println("Enter numbers, Enter 0 to stop");
	do {
		System.out.println("Enter a number: ");
		number = scanner.nextInt();
		sum =sum+ number ;
	} while (number != 0);
	System.out.println(" the sum of numbers :" + sum);
	scanner.close();
	


	}

}
