
public class OOP {

	public static void main(String[] args) {
// OOP ----
	// DVD Player (as an object)
//		- Properties:
//			-Height
//			-Weight
//			-Width
//			-Color
//		- Methods on the DVD class: (things that it can do)
//			-Play
//			-FFW
//			-RW
//			-Pause

		
	// DVD itself
//		-Properties
//			-Movie length
//			-Image
//			-Size
//		-Functionality
//			-Store (storing data written to the DVD)
		
// FOUR PILLARS OF OOP:
		// abstraction
		// encapsulation
		// inheritance
		// polymorphism
		
	
		
// Classes --
		StringBuilder name = new StringBuilder(); // class = instance of class (aka object)
		StringBuilder name2 = new StringBuilder(); // now 2 objects of the SB class
		
		// creating our own class
		// see "student.java" in this package
		// this can be cumbersome, having to write 5 lines for each student, that is why we have constructors..
	Student student1 = new Student();
	student1.firstName="Phteven";
	student1.gradeLevel=12;
		student1.lastName="Nguyen";
		student1.phoneNumber="208-222-2222";
//		
		student1.introduce();
		
		Student student2 = new Student("Post","Malone");
		student2.introduce();
		
		Student student3 = new Student("Biggie","Cheese","307-333-3333",7);
		student3.introduce();
	}

}
