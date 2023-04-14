import java.io.FileNotFoundException;
import java.io.FileReader;
// https://youtu.be/Oo3cX5IvPNQ
public class Exceptions {

	public static void main(String[] args) {
		
	// Exceptions -- things that happen in our code
		// NOT compile errors...
		// that make our code run not as expected
	int[] numbers = new int[3];
	
	
	// They handle the code so that the program does not crash
	// if error at current ln, the next ln won't run
	
	// UNCHECKED EXCEPTION -- Something we don't explicity check for, only thrown because of a programmer's mistakes (idx out of bounds, null pointer)
	if(numbers.length>3) { // if possible to access...
	System.out.println(numbers[3]);
	}
	System.out.println("Congrats, the program didn't crash!");
	
	// CHECKED EXCEPTION -- Something explicitly checking for
	// ex: something happens with a database out of our code

	try {
		// most specific at top, then more general
		// try to run this code, but if exception, catch
		FileReader fileReader = new FileReader("file name");
		System.out.println("In the try.");
	}catch(FileNotFoundException e) {
	e.printStackTrace();
	System.out.println(e.toString());
	}finally {
		System.out.println("-The finally runs regardless");
	}
	System.out.println("-After the try catch");
	}
	
	public static FileReader openFile(String fileName) throws FileNotFoundException {
		return new FileReader(fileName);
	}

}
