//package workAddToGit;
//
//import org.junit.Test;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class TaskTwo {
//
//    private String getSequreEmplId(String cardNumber){
//
//        /*
//         * Провека на карту: если EmplId состоит из чисел и 16 символов - крта
//         * Карта скрывается (формат: ХХХХХХ******ХХХХ)
//         * Если EmplId не карта то в базу вставляется то что там есть
//         * */
//
//        boolean isNumeric = cardNumber.chars().allMatch(Character::isDigit);
//
//        if (isNumeric && cardNumber.toCharArray().length == 16) {
//            cardNumber = hideCardNumber(cardNumber);
//        }
//        return cardNumber;
//    }
//
//    private String hideCardNumber(String cardNumber) {
//        Pattern p = Pattern.compile("(^\\d{6})(\\d{6})(\\d{4})");
//        Matcher matcher = p.matcher(cardNumber);
//        if (matcher.find()) {
//            return matcher.group(1) + "******" + matcher.group(3);
//        } else {
//            return cardNumber;
//        }
//    }
//
//    public TimeIncomeLog(TimeIncomeLogDTO timeIncomeLogDTO) {
////        this.dateTime = timeIncomeLogDTO.getDateTime().withZone(DateTimeZone.getDefault()).toLocalDateTime();
//        this.dateTime = timeIncomeLogDTO.getDateTime();
//        this.ekbId = timeIncomeLogDTO.getEkbId();
//        this.emplId = getSequreEmplId(timeIncomeLogDTO.getEmplId());
//        this.gadgetId = timeIncomeLogDTO.getGadgetId();
//        this.ip = timeIncomeLogDTO.getIp();
//        this.latLng = timeIncomeLogDTO.getLatLng();
//        this.op = timeIncomeLogDTO.getOp();
//        this.srcType = timeIncomeLogDTO.getSrcType();
//    }
//
//    public void setEmplId(String emplId) {
//        this.emplId = getSequreEmplId(emplId);
//    }
//
//    @Test
//    public void setEmplIdTest(){
//        final TimeIncomeLog timeIncomeLogOne = new TimeIncomeLog();
//        timeIncomeLogOne.setEmplId("1234567890114444");
//        assert timeIncomeLogOne.getEmplId().equals("123456******4444");
//
//        final TimeIncomeLog timeIncomeLogTwo = new TimeIncomeLog();
//        timeIncomeLogTwo.setEmplId("123sdaf45");
//        assert timeIncomeLogTwo.getEmplId().equals("123sdaf45");
//
//        final TimeIncomeLog timeIncomeLogTree = new TimeIncomeLog();
//        timeIncomeLogTree.setEmplId("a123456789011444");
//        assert timeIncomeLogTree.getEmplId().equals("a123456789011444");
//
//        final TimeIncomeLog timeIncomeLogFour = new TimeIncomeLog();
//        timeIncomeLogFour.setEmplId("123456789");
//        assert timeIncomeLogFour.getEmplId().equals("123456789");
//    }
//
//    @Test
//    public void timeIncomeLogCreationTest() {
//        final TimeIncomeLogDTO dtoOne = new TimeIncomeLogDTO();
//        dtoOne.setEmplId("1234567890114444");
//        final TimeIncomeLog timeIncomeLogOne = new TimeIncomeLog(dtoOne);
//        assert timeIncomeLogOne.getEmplId().equals("123456******4444");
//
//        final TimeIncomeLogDTO dtoTwo = new TimeIncomeLogDTO();
//        dtoTwo.setEmplId("123sdaf45");
//        final TimeIncomeLog timeIncomeLogTwo = new TimeIncomeLog(dtoTwo);
//        assert timeIncomeLogTwo.getEmplId().equals("123sdaf45");
//
//        final TimeIncomeLogDTO dtoTree = new TimeIncomeLogDTO();
//        dtoTree.setEmplId("1234567890114444");
//        final TimeIncomeLog timeIncomeLogTree = new TimeIncomeLog(dtoTree);
//        assert timeIncomeLogTree.getEmplId().equals("123456******4444");
//
//        final TimeIncomeLogDTO dtoFour = new TimeIncomeLogDTO();
//        dtoFour.setEmplId("123456789123456789");
//        final TimeIncomeLog timeIncomeLogFour = new TimeIncomeLog(dtoFour);
//        assert timeIncomeLogFour.getEmplId().equals("123456789123456789");
//
//    }
//
//}
