
public class Manager extends Employee{
	
	private double bonusPercentage;
	
	public Manager(String firstName, String lastName, double pay, double bonusPercentage) {
		super(firstName, lastName, pay);
		this.bonusPercentage = bonusPercentage;
	}


	
	@Override
	// tells you that this is coming from a parent class
	public double calcPay() {
		return getPay()*80*bonusPercentage;
	}
}
