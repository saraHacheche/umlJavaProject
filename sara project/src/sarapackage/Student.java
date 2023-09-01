package sarapackage;

public class Student{
	 private String name;
	    private String address;
	    private String phoneNumber;
	    private String studentId;
	    
	    public Student(String name, String address, String phoneNumber, String studentId) {
	        this.name = name;
	        this.address = address;
	        this.phoneNumber = phoneNumber;
	        this.studentId = studentId;
	    }
	    
	    public void learn() {
	        System.out.println("My name is " + this.name + ". I am learning.");
	    }
	    
	    public void performAssignment() {
	        System.out.println("My name is " + this.name + ". I am performing an assignment.");
	    }
	    
	    public void read() {
	        System.out.println("My name is " + this.name + ". I am reading.");
	    }
	    
	    public void attendance() {
	        System.out.println("My name is " + this.name + ". I am taking attendance.");
	    }
	    
	    public void doPresentation() {
	        System.out.println("My name is " + this.name + ". I am doing a presentation.");
	    }
	    
	   
	    
	    public String getName() {
	        return name;
	    }
	    
	    public String getAddress() {
	        return address;
	    }
	    
	    public String getPhoneNumber() {
	        return phoneNumber;
	    }
	    
	    public String getStudentId() {
	        return studentId;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public void setAddress(String address) {
	        this.address = address;
	    }
	    
	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }
	    
	    public void setStudentId(String studentId) {
	        this.studentId = studentId;
	        
	    }
	}
	

	


