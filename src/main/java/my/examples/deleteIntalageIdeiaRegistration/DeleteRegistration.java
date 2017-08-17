package my.examples.deleteIntalageIdeiaRegistration;

import java.util.List;

public interface DeleteRegistration {

	String deleteFile(String pathToDeleteFile);

	List<String> readAndDeleteTextLines(String pathToReadFile, String text);

	void writeStringToFile(String path, List<String> strings);

}
