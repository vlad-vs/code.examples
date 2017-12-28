package my.examples.deleteIntalageIdeiaRegistration;

import java.util.List;

public class DeleteWebShtorm {
	public static void main(String[] args) {

		String pathToDel = "/home/vlad-vs/.WebStorm2017.2/config/eval/WebStorm172.evaluation.key";

		String pathToDelLines = "/home/vlad-vs/.WebStorm2017.2/config/options/options.xml";

		String lineContainToDel = "evl";


		DeleteRegistration deleteServise = new DeleteRegistrationImpl();

		String s = deleteServise.deleteFile(pathToDel);
		System.out.println(s);

		List<String> list = deleteServise.readAndDeleteTextLines(pathToDelLines,lineContainToDel);

		deleteServise.writeStringToFile(pathToDelLines,list);
	}
}
