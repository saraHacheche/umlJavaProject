package sarapackage;
import java.util.Scanner;
public class Sara3 {
  //SARA HACHECHE
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter Your Integer: ");
	        int number = input.nextInt();
	        
	        int sum = 0;
	        for (int i = 1; i <= number; i++) {
	            sum += i;
	        }
	        
	        System.out.println("The sum of  numbers  " + number + " is: " + sum);
	        
	        input.close();
	    }
	}
	





	

