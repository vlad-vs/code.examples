package my.examples.deleteIntalageIdeiaRegistration;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DeleteRegistrationImpl implements DeleteRegistration{

	//        String pathToDel = "C:\\Users\\HardWorker\\.IntelliJIdea2017.2\\config\\eval\\idea171.evaluation.key";
	private String pathToDeleteFile ="D:\\ForTestJavaProgram\\del.txt";

	//        String pathToDelLines = "C:\\Users\\HardWorker\\.IntelliJIdea2017.2\\config\\options\\options.xml";
	private String pathToReadFile = "D:\\ForTestJavaProgram\\options.xml";


	@Override
	public String deleteFile(String pathToDeleteFile) {
		File file = new File(pathToDeleteFile);
		if (file.exists()) {
			file.delete();
			return "deleyted " + pathToDeleteFile;
		} else return "File not found " + pathToDeleteFile;
	}

	@Override
	public List<String> readAndDeleteTextLines(String pathToReadFile, String text) {
		String line;
		List<String> strings = new ArrayList<>();
		File file = new File(pathToReadFile);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while ((line = reader.readLine()) != null) {
				if (!line.contains(text)) {
					strings.add(line);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return strings;
	}

	@Override
	public void writeStringToFile(String path, List<String> strings) {
		BufferedWriter writer;

		try {
			writer = new BufferedWriter(new FileWriter(path));
			for (String s : strings) {
				writer.append(s);
				writer.append("\r\n");
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void run(){
//        deleteFile();
//        readAndDeleteTextLines();
//        writeStringToFile();
	}
}
