package my.examples.multithreading;

public class InsufficientResourcesException extends IllegalArgumentException {
	public InsufficientResourcesException(String s) {
		super(s);
	}
}
