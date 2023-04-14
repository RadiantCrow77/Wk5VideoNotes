
public class Student { // classes -- notation is uppercase
	static int numberOfStudents;
	
	
	String firstName; // since this is just the blue print, we don't give the value, there will be multi students
	String lastName;
	String phoneNumber;
	int gradeLevel; // 1-12
	
	public Student() {}
	
	public Student(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName = lastName;
	}
	

	// CONSTRUCTOR
	// no return type
	public Student(String firstName, String lastName, String phoneNumber, int gradelevel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel =gradelevel;
	}
	public void introduce() {
		System.out.println("Hello, my name is "+firstName+" "+lastName);
		System.out.println("I am in grade "+gradeLevel+".");
		System.out.println("My phone number is "+phoneNumber+".");
		
		
}
	
	private boolean checkLength(String str, int length) {
		return str.length() >length;
	}
	
	// Access modifiers - ALWAYS public
	public void setFirstName(String firstName) {
		if(checkLength(firstName, 1)){// firstName must have a value greater than 1 char
			this.firstName = firstName; 
		}
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		if(checkLength(lastName, 1)){
		this.lastName=lastName;
		}
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(checkLength(phoneNumber, 9)) {
		this.phoneNumber = phoneNumber;
		}
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setGradeLevel(int gradeLevel) {
	if(gradeLevel>0&&gradeLevel<13) {
			this.gradeLevel = gradeLevel;
	}
	}
	
	public int getGradeLevel() {
		return gradeLevel;
	}
	
}
