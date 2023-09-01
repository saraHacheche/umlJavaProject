package sarapackage;

public class Sara5 {
// SARA HACHECHE
	public static void main(String[] args) {
		 for (int number = 1; number <= 10; number++) {
	            System.out.println("Multiplication Table of " + number);
	            for (int i = 1; i <= 10; i++) {
	                int result = number * i;
	                System.out.printf("%d x %d = %d%n", number, i, result);
	            }

	            System.out.println();
	        }
	    }
	}
