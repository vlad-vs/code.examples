package my.examples.regularExpres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestSequre {

    public String getSequreEmplId(String cardNumber){

        /*
         * Провека на карту: если EmplId состоит из чисел и 16 символов - крта
         * Карта скрывается (формат: ХХХХХХ******ХХХХ)
         * Если EmplId не карта то в базу вставляется то что там есть
         * */

        boolean isNumeric = cardNumber.chars().allMatch(Character::isDigit);

        if (isNumeric && cardNumber.toCharArray().length == 16) {
            String hiddenCardNumber = hideCardNumber(cardNumber);
            cardNumber = hiddenCardNumber;
        }
        return cardNumber;
    }

    private String hideCardNumber(String cardNumber) {
        Pattern p = Pattern.compile("(^\\d{6})(\\d{6})(\\d{4})");
        Matcher matcher = p.matcher(cardNumber);
        if (matcher.find()) {
            return matcher.group(1) + "******" + matcher.group(3);
        } else {
            return cardNumber;
        }
    }

}
