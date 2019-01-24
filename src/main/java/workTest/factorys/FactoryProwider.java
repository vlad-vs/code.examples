package workTest.factorys;

public class FactoryProwider {


    WorkersFactory getFactory(String factory){
        switch (factory) {
            case "1":
                return new JavaDevFactory();
            case "2":
                return new PhpDevFactory();
            default:
                throw new RuntimeException("не вернеый аргумент!!");
        }
    }

}
