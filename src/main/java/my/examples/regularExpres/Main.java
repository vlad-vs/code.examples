package my.examples.regularExpres;

public class Main {

    public static void main(String[] args) {
//        TestClone testClone = new TestClone();
//        PojoForTest pojoForTest = new PojoForTest();
//        SecondLevel secondLevel = new SecondLevel();
//        pojoForTest.setSecondLevel(secondLevel);
//        pojoForTest.setName("NemePojo");
//        pojoForTest.getSecondLevel().setCartNumber("1234567890114444");
//        testClone.insertToDb(pojoForTest);

        String text = "1234567890114444";
        TestSequre testSequre = new TestSequre();
        System.out.println(testSequre.getSequreEmplId(text));

    }
}
