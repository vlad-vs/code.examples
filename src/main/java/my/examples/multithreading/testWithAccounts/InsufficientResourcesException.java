package my.examples.multithreading.testWithAccounts;

public class InsufficientResourcesException extends IllegalArgumentException {
	public InsufficientResourcesException(String s) {
		super(s);
	}
}
