package sarapackage;

import java.util.Scanner;

// SARA HACHECHE
public class Calcul1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
    int firstNumber , secondNumber ;
    Scanner scanner= new Scanner (System.in);
    System.out.print("Please enter your first number :");
    firstNumber = scanner.nextInt();
    System.out.print("Please enter your second number :");
    secondNumber = scanner.nextInt();
    if (firstNumber == secondNumber) {
    	System.out.println("first number is equal to second number");
    }
    if (firstNumber > secondNumber) {
    	System.out.println("first number is greather than second number");
    }
    if (firstNumber < secondNumber) {
    	System.out.println("first number is lesser than second number");
	}

}
}
	
