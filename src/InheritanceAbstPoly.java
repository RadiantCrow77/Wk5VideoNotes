
public class InheritanceAbstPoly {

	public static void main(String[] args) {
	Employee salary = new SalariedEmployee("Jack", "Neutron", 2500.00);
	Employee hourly = new HourlyEmployee("Guilty","Regicide",15.75,76);
	Employee manager = new Manager("Rad","Crow",4555.40,15.3);
	System.out.println(salary.calcPay());
	System.out.println(hourly.calcPay());
	System.out.println(manager.calcPay());
	}
	

}
