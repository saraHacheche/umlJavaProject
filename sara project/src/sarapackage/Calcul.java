package sarapackage;
import java.util.Scanner;
// SARA HACHECHE 
public class Calcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber , secondNumber , sum  ;
		
	
    Scanner scanner= new Scanner (System.in);
    System.out.print("Please enter your first number :");
    firstNumber= scanner.nextInt();
    System.out.print("Please enter your second number :");
    secondNumber= scanner.nextInt();
    sum=firstNumber+secondNumber;
    float average= (sum / 2f) ;
    
    System.out.printf("The sum of this numbers is : %d\n",firstNumber + secondNumber);
    
    System.out.printf("the difference of this numbers is :%d", secondNumber - firstNumber);
    System.out.println();
    System.out.printf("the product of this numbers is :%d\n", firstNumber * secondNumber);
    System.out.printf("the average of this number is :%f", average);
	}

}
