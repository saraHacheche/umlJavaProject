package sarapackage;
import javax.swing.JOptionPane;
public class Rony2 {
// SARA HACHECHE
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int num1 , num2 ,  num3 ,  smallest ,  largest ;

		 String input1 = JOptionPane.showInputDialog("Enter the first number:");
	        String input2 = JOptionPane.showInputDialog("Enter the second number:");
	        String input3 = JOptionPane.showInputDialog("Enter the third number:");
	       
	         num1 = Integer.parseInt(input1);
	         num2 = Integer.parseInt(input2);
	         num3 = Integer.parseInt(input3);
	        smallest = Math.min(Math.min(num1, num2), num3);
	        largest = Math.max(Math.max(num1, num2), num3);

	        String message = "The smallest number is " + smallest + "\nThe largest number is " + largest;

	        JOptionPane.showMessageDialog(null, message, "Integer Comparison", JOptionPane.PLAIN_MESSAGE);

	}

}
