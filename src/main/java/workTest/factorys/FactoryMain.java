package workTest.factorys;

public class FactoryMain {

    public static void main(String[] args) {
        FactoryProwider factoryProwider = new FactoryProwider();
        Worker instanse = factoryProwider.getFactory("1").getInstanse();
        instanse.createTask();
        instanse.doSomeWork();
    }
}
