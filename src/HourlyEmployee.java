
public class HourlyEmployee extends Employee{
	private double hoursWorked;
	
	public HourlyEmployee(String firstName, String lastName, double pay, double hoursWorked) {
		
		super(firstName, lastName, pay);
		this.hoursWorked = hoursWorked;
		
	}


	
	@Override
	// tells you that this is coming from a parent class
	public double calcPay() {
		return this.getPay()*hoursWorked;
	}
}
