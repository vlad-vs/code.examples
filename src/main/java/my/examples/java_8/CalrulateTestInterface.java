package my.examples.java_8;

public interface CalrulateTestInterface {

	int calculate (int a);

	default int dubleS(int a){
		return a * a;
	}
}
