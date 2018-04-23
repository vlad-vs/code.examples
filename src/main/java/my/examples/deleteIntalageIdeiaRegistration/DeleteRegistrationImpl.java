package my.examples.deleteIntalageIdeiaRegistration;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DeleteRegistrationImpl implements DeleteRegistration {


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
		if (file.exists()) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				while ((line = reader.readLine()) != null) {
					if (!line.contains(text)) {
						strings.add(line);

					} else System.out.println(line + " del");
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else System.out.println("file not found " + pathToReadFile);


		return strings;
	}

	@Override
	public void writeStringToFile(String path, List<String> strings) {
		BufferedWriter writer;

		File f = new File(path);
		if (f.exists()) {
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
		}else System.out.println("file not found " + path);
	}


}