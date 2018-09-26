package еуеые;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Masuin {

    private static final Pattern pattern = Pattern.compile("^([\\w]+)(\\|{1})([\\w]+)*");

    private static String getAlias(String rewAlias) {
        String alias = "";
        Matcher matcher = pattern.matcher(rewAlias);
        if (matcher.find()) {
            String brnmLlocalIp = matcher.group(3);
            String brnm = matcher.group(1);
            // приоритет BRNM.LOCALIP если его нет то берем из BRNM
            if (brnmLlocalIp != null) {
                alias = brnmLlocalIp;
            } else if (brnm != null) {
                alias = brnm;
            }
        }
        return alias;
    }


    public static void main(String[] args) {
        String alias = getAlias("BR|");
        System.out.println(alias);
    }
}
