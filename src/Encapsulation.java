
public class Encapsulation {

	public static void main(String[] args) {
	// this is considered very bad practice in OOP
	Student student = new Student();
	student.setFirstName("Jack");
	student.setLastName("W0jack");
	student.setPhoneNumber("208idahophone#");
	System.out.println(student.getFirstName()); // null if not > 1 char
	System.out.println(student.getPhoneNumber()); // null if not >=10
	student.introduce();
	
	Rectamgle rec = new Rectamgle(10,15);
	rec.setLength(10);
	System.out.println(rec.getArea());
	// Better to use "access modifiers"
	// there are 3 modifiers + nothing
//	 Public -- accessible everywhere
//	 Private -- only accessible from within the class itself
//	 Protected -- only accessible within the class, other classes in same pckge, and all subclasses
//	 None -- same as protected, except not accessible in subclasses in a diff package
	
	
	}

}
