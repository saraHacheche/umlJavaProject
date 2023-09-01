package sarapackage;

public class Execution {

	public static void main(String[] args) {
		

		Student student1 = new Student("SARA HACHECHE", "MONTREAL", "514-1234", "01");
		Student student2 = new Student("DIANA BUGA", "LAVAL", "514-5678", "02");
		Student student3 = new Student("DORIN AVRAM", "LANGEUIL", "514-9012", "03");
		////////
		System.out.println("My name is " + student1.getName());
		System.out.println("My name is " + student2.getName());
		System.out.println("My name is " + student3.getName());
		student1.learn();
		student2.learn();
		student3.learn();
	
		

	}

}
