
public interface Logger {
// does not define any method implementations
	// interface -- only define method signatures
	// create interface when you know WHAT you want to happen, but not HOW

	
	// SIGNATURES
	public void info(String info);
	public void warning(String warning);
	public void error(String error);
	public void fatal(String fatal);
	public void close();
}
