import java.util.Date;

public class ConsoleLogger implements Logger{// implements the logger

	@Override
	public void info(String info) {
		Date date = new Date();
		System.out.println(date.toString()+": " + info);
	}

	@Override
	public void warning(String warning) {
		Date date = new Date();
		System.out.println("Warning "+ date.toString()+": "+ warning);
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		// err makes text red
		System.err.println("Error "+ date.toString()+": "+ error);
	}

	@Override
	public void fatal(String fatal) {
		Date date = new Date();
		System.err.println("FATAL!!!! "+ date.toString()+": "+ fatal.toUpperCase());
	} 
	
	@Override
	public void close() { // closes the writer on file logger
	} 

}
