package my.examples.regularExpres;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClone {

    private void insertToDb(PojoForTest result) {

        System.out.println(result);

        /*
         * Провека на добавление карты, если EmplId состоит из чисел и 16  символов
         * то создается клон обьекта, у него шифруется номер карты (формат: ХХХХХХ******ХХХХ)
         * В базу сетится клонированный объект с зашифрованным ключем
         * */

        String cardNumber = result.getSecondLevel().getCartNumber();

        boolean isNumeric = cardNumber.chars().allMatch(Character::isDigit);

        if (isNumeric && cardNumber.toCharArray().length == 16) {
            PojoForTest cloneResult = null; //(PojoForTest) cloneObject(result);
            if (!(cloneResult == null)) {
                String hiddenPasswordForInsertToDb = hidePasswordForInsertToDB(cardNumber);
                cloneResult.getSecondLevel().setCartNumber(hiddenPasswordForInsertToDb);
                result = cloneResult;
//                System.out.print();
                System.out.printf("+++_RegPossibilityComponent => insertToDb() = Object cloned {}"+"\n", result.toString());
            } else {
                System.out.printf("---_RegPossibilityComponent => insertToDb() = Object not cloned {}"+"\n", result.toString());
            }
        }

        System.out.println(result);

//        final int insertedCount = regPossibilityMapper.insert(new RegPossibilityResultDbDto(result));
//        String insertedRes = insertedCount > 0 ? "success" : "FAIL";
//        System.out.printf("*** .../poscheck insertToDb() [{}] - {}", result.getDataKeyInfo(), insertedRes);
    }

    private String hidePasswordForInsertToDB(String password) {
        Pattern p = Pattern.compile("(^\\d{6})(\\d{6})(\\d{4})");
        Matcher matcher = p.matcher(password);
        if (matcher.find()) {
            System.out.printf("+++_RegPossibilityComponent => hidePasswordForInsertToDB() из insertToDb() по password = {}"+"\n", password);
            return matcher.group(1) + "******" + matcher.group(3);
        } else {
            System.out.printf("---_RegPossibilityComponent => hidePasswordForInsertToDB() из insertToDb() по password = {}"+"\n", password);
            return password;
        }
    }

    private Object cloneObject(Object o) {
        Object obg = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream ous = new ObjectOutputStream(baos);

            //сохраняю и закрываем поток
            ous.writeObject(o);
            ous.close();

            // создаю копию из потока
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            obg = ois.readObject();
            return obg;
        } catch (ClassNotFoundException e) {
            System.out.printf("---_RegPossibilityComponent => cloneObject() из insertToDb() по Object = {} и ошибке {}"+"\n", o, e);
        } catch (IOException e) {
            System.out.printf("---_RegPossibilityComponent => cloneObject() из insertToDb() по Object = {} и ошибке {}"+"\n", o, e);
        }
        return obg;
    }

}
