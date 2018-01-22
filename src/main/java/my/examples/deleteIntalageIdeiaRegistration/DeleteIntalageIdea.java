package my.examples.deleteIntalageIdeiaRegistration;

import java.util.List;

public class DeleteIntalageIdea {
	public static void main(String[] args) {
// windows
		String pathToDel = "C:\\Users\\vlad-\\.IntelliJIdea2017.3\\config\\eval\\idea173.evaluation.key";
// linux
//		String pathToDel = "/home/vlad-vs/.IntelliJIdea2017.3/config/eval/idea173.evaluation.key";
// windows
		String pathToDelLines = "C:\\Users\\vlad-\\.IntelliJIdea2017.3\\config\\options\\options";
// linux
//		String pathToDelLines = "/home/vlad-vs/.IntelliJIdea2017.3/config/options/options.xml";

		String lineContainToDel = "evl";

		DeleteRegistration deleteServise = new DeleteRegistrationImpl();

		String s = deleteServise.deleteFile(pathToDel);
		System.out.println(s);

		List<String> list = deleteServise.readAndDeleteTextLines(pathToDelLines,lineContainToDel);

		deleteServise.writeStringToFile(pathToDelLines,list);
	}
}
