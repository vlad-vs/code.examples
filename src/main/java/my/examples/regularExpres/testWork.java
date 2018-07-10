//package my.examples.regularExpres;
//
//import com.google.inject.internal.util.Strings;
//import com.sun.org.apache.xpath.internal.operations.Number;
//
//import java.io.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class testWork {
//
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        String id = "12345678911144";
//        PojoForTest pojoForTest1 = new PojoForTest(id);
//        PojoForTest pojoForTest2 = (PojoForTest) cloneObgect(pojoForTest1);
//        Number s = new Number();
//
//
//        boolean isNumeric = id.chars().allMatch( Character::isDigit );
//
//        System.out.println(isNumeric);
//        if (id.toCharArray().length == 16) {
//            String newPass = regexIdForInsertToDB(id);
////            pojoForTest1.setPassword(newPass);
//        }
//
//        System.out.println(pojoForTest1);
//        System.out.println(pojoForTest2);
//
//
////        System.out.println("new " + maskCardNumber(id));
//
//    }
//
//    private static String regexIdForInsertToDB(String id) {
//
//        Pattern p = Pattern.compile("(^\\d{6})(\\d{6,9})(\\d{4})");
//
//        Matcher matcher = p.matcher(id);
//
//        if (matcher.find()) {
//            System.out.println("ok" + matcher.group(1) + "/" + matcher.group(3));
//            System.out.println(matcher.group(1) + "*" + matcher.group(3));
//            return matcher.group(1) + "*" + matcher.group(3);
//        } else {
//            System.out.println("No maches");
//            return "No mach";
//        }
//    }
//
//    private static Object cloneObgect(Object o) throws IOException, ClassNotFoundException {
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ObjectOutputStream ous = new ObjectOutputStream(baos);
//
//        //сохраняю и закрываем поток
//        ous.writeObject(o);
//        ous.close();
//
//        // создаю копию из потока
//        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
//        ObjectInputStream ois = new ObjectInputStream(bais);
//
//        return ois.readObject();
//    }
//
//
////    public static String maskCardNumber(String srsCardNumber){
////        int a  = srsCardNumber.toCharArray().length;
////        if (a < 1){
////            return "";
////        }
////        return srsCardNumber.replaceAll("\\b(\\d{4,7})(\\d{8})(\\d{4})", srsCardNumber);
////    }
//}
