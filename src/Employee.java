//https://www.youtube.com/watch?v=73zm2v8wvLo&list=PLOjhQ09ZGiAPm6S5VeqzvCV3gprc1gP8V&index=24&t=2s
public abstract class Employee { // parent class to eliminate duplicate code
	// abstract --- class cannot be instantiated, just an abstr of an employee
		// therefore implement a lot of the methods in classes that inherit FROM this
	// POLYMORPHISM: SalariedEmployee, HourlyEmployee, and Manager classes will implement this in their OWN way
	private String firstName;
	private String lastName;
	private double pay;
	private String address;
	private String reportsTo;
	private double bonusPercentage;
	
	// bonus constructor
	public Employee(String firstName, String lastName, double pay) {
		this.firstName = firstName;
		this.lastName= lastName;
		this.pay = pay;
	}
	
	public abstract double calcPay();
	
	public String getInfo() { // info describing each employee
		return  "Name: "+firstName+ " "+ lastName
				+"\nReports to: "+reportsTo
				+"\nAddress: "+address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}

	public double getBonusPercentage() {
		return bonusPercentage;
	}

	public void setBonusPercentage(double bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}
}
