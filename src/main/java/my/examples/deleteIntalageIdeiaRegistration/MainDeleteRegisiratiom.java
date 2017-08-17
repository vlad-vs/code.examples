package my.examples.deleteIntalageIdeiaRegistration;

import java.util.List;

public class MainDeleteRegisiratiom {

	public static void main(String[] args) {

		//        String pathToDel = "C:\\Users\\HardWorker\\.IntelliJIdea2017.2\\config\\eval\\idea171.evaluation.key";
		String pathToDel = "D:\\ForTestJavaProgram\\del.txt";

		//        String pathToDelLines = "C:\\Users\\HardWorker\\.IntelliJIdea2017.2\\config\\options\\options.xml";
		String pathToDelLines = "D:\\ForTestJavaProgram\\options.xml";

		String lineContainToDel = "evl";
		//        String lineContainToDel = "property";

		DeleteRegistration deleteServise = new DeleteRegistrationImpl();

		String s = deleteServise.deleteFile(pathToDel);

		List<String> list = deleteServise.readAndDeleteTextLines(pathToDelLines, lineContainToDel);

		deleteServise.writeStringToFile(pathToDelLines, list);

	}
}