package my.examples.deleteIntalageIdeiaRegistration;

import java.util.List;

public class DeleteWebShtorm {
	public static void main(String[] args) {
// windowsC:\Program Files\JetBrains\WebStorm 181.2784.29\bin
		String pathToDel = "C:\\Users\\vlad-\\.WebStorm2018.1\\config\\eval\\WebStorm181.evaluation.key";
// linux
//		String pathToDel = "/home/vlad-vs/.WebStorm2017.2/config/eval/WebStorm172.evaluation.key";
// windows
		String pathToDelLines = "C:\\Users\\vlad-\\.WebStorm2018.1\\config\\options\\options.xml";
// linux
//		String pathToDelLines = "/home/vlad-vs/.WebStorm2017.2/config/options/options.xml";

		String lineContainToDel = "evl";


		DeleteRegistration deleteServise = new DeleteRegistrationImpl();

		String s = deleteServise.deleteFile(pathToDel);
		System.out.println(s);

		List<String> list = deleteServise.readAndDeleteTextLines(pathToDelLines,lineContainToDel);

		deleteServise.writeStringToFile(pathToDelLines,list);
	}
}
