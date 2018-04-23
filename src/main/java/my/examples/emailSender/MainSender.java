package my.examples.emailSender;

public class MainSender {
//	private static String myMail = "vlad.java.7@gmail.com";
	private static String myMail = "vladvs.service@gmail.com";
//	private static String myPassword = "1234qwerty";
	private static String myPassword = "svdalVSem77";

	private static SenderEmailService senderEmail = new SenderEmailService(myMail,myPassword);

	public static void main(String[] args) {
		String textMail = "" +
				"<!DOCTYPE html>\n" +
				"<html lang=\"en\">\n" +
				"<head>\n" +
				"\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
				"\t<meta charset=\"UTF-8\">\n" +
				"</head>\n" +
				"<body class=\"body\">\n" +
				"\n" +
				"\t<h1>Hello World</h1>\n" +
				"\n" +
				"</body>\n" +
				"</html>";
		senderEmail.send("subgect",textMail,myMail,"vladvs.dev@gmail.com");
		System.out.println("sended");
	}
}
