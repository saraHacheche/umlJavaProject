package sarapackage;
import javax.swing.JOptionPane;
// SARA HACHECHE 
public class Rony1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input1 = JOptionPane.showInputDialog("Enter the first number:");
	        String input2 = JOptionPane.showInputDialog("Enter the second number:");

	        int num1 = Integer.parseInt(input1);
	        int num2 = Integer.parseInt(input2);

	        int sum = num1 + num2;
	        int product = num1 * num2;
	        int difference = num1 - num2;
	        int quotient = num1 / num2;
	        String message = "The sum is " + sum +
	                "\nThe product is " + product +
	                "\nThe difference is " + difference +
	                "\nThe quotient is " + quotient;

	        JOptionPane.showMessageDialog(null, message, "Integer Operations", JOptionPane.PLAIN_MESSAGE);

	}

}
