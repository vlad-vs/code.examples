//package my.examples.regularExpres;
//
//import java.io.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class NotForPlay {
//
//    public void insertToDb(RegPossibilityResult result) {
//
//        /*
//         * Провека на добавление карты, если EmplId состоит из чисел и 16 символов
//         * то создается клон обьекта, у него шифруется номер карты (формат: ХХХХХХ******ХХХХ)
//         * В базу сетится клонированный объект с зашифрованным ключем
//         * Если EmplId не карта то в базу вставляется то что там есть
//         * */
//
//        String cardNumber = result.getTimeIncomeLog().getEmplId();
//
//        boolean isNumeric = cardNumber.chars().allMatch(Character::isDigit);
//
//        if (isNumeric && cardNumber.toCharArray().length == 16) {
//            RegPossibilityResult cloneResult = (RegPossibilityResult) cloneObject(result);
//            if (!(cloneResult == null)) {
//                String hiddenPasswordForInsertToDb = hidePasswordForInsertToDB(cardNumber);
//                cloneResult.getTimeIncomeLog().setEmplId(hiddenPasswordForInsertToDb);
//                result = cloneResult;
//                log.debug("+++_RegPossibilityComponent => insertToDb() = Object cloned {}", result.toString());
//            } else {
//                log.debug("---_RegPossibilityComponent => insertToDb() = Object not cloned {}", result.toString());
//            }
//        }
//
//        final int insertedCount = regPossibilityMapper.insert(new RegPossibilityResultDbDto(result));
//        String insertedRes = insertedCount > 0 ? "success" : "FAIL";
//        log.debug("*** .../poscheck insertToDb() [{}] - {}", result.getDataKeyInfo(), insertedRes);
//    }
//
//    private String hidePasswordForInsertToDB(String password) {
//        Pattern p = Pattern.compile("(^\\d{6})(\\d{6})(\\d{4})");
//        Matcher matcher = p.matcher(password);
//        if (matcher.find()) {
//            log.debug("+++_RegPossibilityComponent => insertToDb() => hidePasswordForInsertToDB() пароль зашифрован = {}", password);
//            return matcher.group(1) + "******" + matcher.group(3);
//        } else {
//            log.debug("???_RegPossibilityComponent => insertToDb() => hidePasswordForInsertToDB() пароль не изменен = {}", password);
//            return password;
//        }
//    }
//
//    private Object cloneObject(Object o) {
//        Object obg = null;
//        try {
//            ByteArrayOutputStream baos = new ByteArrayOutputStream();
//            ObjectOutputStream ous = new ObjectOutputStream(baos);
//
//            //сохраняю и закрываем поток
//            ous.writeObject(o);
//            ous.close();
//
//            // создаю копию из потока
//            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
//            ObjectInputStream ois = new ObjectInputStream(bais);
//            obg = ois.readObject();
//            return obg;
//        } catch (ClassNotFoundException e) {
//            log.debug("---_RegPossibilityComponent => insertToDb() => cloneObject() по Object = {} и ошибка {}", o, e);
//        } catch (IOException e) {
//            log.debug("---_RegPossibilityComponent => insertToDb() => cloneObject() по Object = {} и ошибка {}", o, e);
//        }
//        return obg;
//    }
//}
