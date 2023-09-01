package sarapackage;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne personne= new Personne();
		personne.name="HACHECHE";
		personne.firstname="Sara";
		personne.age=29;
		
		System.out.println(personne);
		
		for (int i = 0; i < 10; i++) {
			for(int j=0; j<10; j++)
			System.out.println("*********"+i);
		}
		Scanner input =new Scanner(System.in);
		int number1, number2, sum;
		
		System.out.println("enter first number:");
		JOptionPane.showInputDialog(null, "hello sara");
		number1 = input.nextInt();
		System.out.println("enter second number:");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		System.out.printf("Sum of %d and %d is %d", number1,number2,sum);
				
		
	}

}
