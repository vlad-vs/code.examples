package my.examples.regularExpres;

import com.google.common.base.Strings;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AliasRegex {


    public static void main(String[] args) {

        System.out.println(getAlias("DNH0|"));

    }

    private static void hidePasswordForInsertToDB(String password) {
        Pattern p = Pattern.compile("^(\\w{4})+(\\|)+(\\w{4}|\\w{0}?)\\b");
        Matcher matcher = p.matcher(password);
        if (matcher.find()) {
            System.out.println("1 " + matcher.group(1) + ", 2 " + matcher.group(2) + ", 3 " + matcher.group(3));
            boolean b = matcher.group(3).length() == 4 ;
            System.out.println(b);

            System.out.println("==================");
        }

    }

    private static String getAlias(String alias) {
        String result = "";
        Pattern p = Pattern.compile("^(\\w{4})+(\\|)+(\\w{0,4})\\b");
        Matcher matcher = p.matcher(alias);
        if (matcher.find()) {
            String brnm = matcher.group(1);
            String brnmLlocalIp = matcher.group(3);
            if (brnmLlocalIp.length() == 4) {
                result = brnmLlocalIp;
            } else if (brnm.length() == 4) {
                result = brnm;
            }
        }
        return result;
    }

}
