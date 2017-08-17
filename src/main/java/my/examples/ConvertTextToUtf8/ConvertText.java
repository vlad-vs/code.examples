package my.examples.ConvertTextToUtf8;

import java.io.UnsupportedEncodingException;

public class ConvertText {

	//    Используется для вывода на JSP
	public String convertToUtf(String stringToConvertUtfFormat) {
		String textInUtfFormat = null;
		try {
			textInUtfFormat = new String(stringToConvertUtfFormat.getBytes(), "UTF-8");
//            utf строка поступает с поломанной буквой "И"
			textInUtfFormat = textInUtfFormat.replace("�?", "И");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return textInUtfFormat;
	}
}
