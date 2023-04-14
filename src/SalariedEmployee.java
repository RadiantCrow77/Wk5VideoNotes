
public class SalariedEmployee extends Employee{ 
	
	public SalariedEmployee(String firstName, String lastName, double pay) {
		super(firstName, lastName, pay); // super method: super class "Employee"'s constructor, 
		// class we're
		//inheriting from
	}
	@Override
	// tells you that this is coming from a parent class
	public double calcPay() {
	return this.getPay()*80; // 80 hr pay period
	}

}
