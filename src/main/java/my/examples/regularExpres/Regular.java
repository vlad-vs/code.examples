package my.examples.regularExpres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Вот примеры основных метасимволов:
  ^     - (крышка, цирркумфлекс) начало проверяемой строки
  $     - (доллар) конец проверяемой строки
  .     - (точка) представляет собой сокращенную форму записи для символьного класса, совпадающего с любым символом
  |     -  означает «или». Подвыражения, объединенные этим способом, называются альтернативами (alternatives)
  ?     - (знак вопроса) означает, что предшествующий ему символ является необязательным
  +     -  обозначает «один или несколько экземпляров непосредственно предшествующего элемента
  *     –  любое количество экземпляров элемента (в том числе и нулевое)
  \\    -  точка
  \\d   –  цифровой символ
  \\D   –  не цифровой символ
  \\s   –  пробельный символ
  \\S   –  не пробельный символ
  \\w   –  буквенный или цифровой символ или знак подчёркивания
  \\W   –  любой символ, кроме буквенного или цифрового символа или знака подчёркивания

   +     - Одно или более
   *     - Ноль или более
   ?     - Ноль или одно
   {n}   - Ровно n раз
   {m,n} - От m до n включительно
   {m,}  - Не менее m
   {,n}  - Не более n

*/


public class Regular {

	public static void main(String[] args){
		System.out.println("Регулярное выражение:");

		System.out.println(checkWithRegExp("_@BEST"));
		System.out.println(checkWithRegExp("vovan"));
		System.out.println(checkWithRegExp("vo"));
		System.out.println(checkWithRegExp("Z@OZA"));

		System.out.println("\nРучная проверка:");

		System.out.println(dumbCheck("_@BEST"));
		System.out.println(dumbCheck("vovan"));
		System.out.println(dumbCheck("vo"));
		System.out.println(dumbCheck("Z@OZA"));
	}

	//Регулярное выражение:
	public static boolean checkWithRegExp(String userNameString){

		//Class Pattern - Регулярное выражение, которое Вы записываете в строке,
		// должно сначала быть скомпилированным в объект данного класса.
		Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");

		//Объект Matcher анализирует строку, начиная с 0, и ищет соответствие шаблону 'p'.
		Matcher m = p.matcher(userNameString);
		return m.matches();
	}

	//Ручная проверка:
	public static boolean dumbCheck(String userNameString){

		char[] symbols = userNameString.toCharArray();
		if(symbols.length < 3 || symbols.length > 15 ) return false;

		String validationString = "abcdefghijklmnopqrstuvwxyz0123456789_";

		for(char c : symbols){
			if(validationString.indexOf(c)==-1) return false;
		}
		return true;
	}

}
