package my.examples.emailSender;

public class MainSender {
	private static String myMail = "vlad.java.7@gmail.com";
	private static String myPassword = "1234qwerty";

	private static SenderEmailService senderEmail = new SenderEmailService(myMail,myPassword);

	public static void main(String[] args) {
		senderEmail.send("subgect","textMail",myMail,"vladvs.dev@gmail.com");
		System.out.println("sended");
	}
}
