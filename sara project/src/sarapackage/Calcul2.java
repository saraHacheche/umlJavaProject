package sarapackage;

import java.util.Scanner;

public class Calcul2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// change the time
		int  seconds ;
	    Scanner scanner= new Scanner (System.in);
	    System.out.print("Please change the time in seconds :");
	    seconds = scanner.nextInt();
	    float minutes = seconds / 60f ; 
	    System.out.printf("Please change the time in minutes :%f ", minutes);
	    
	 
	    
	  


	}

}
