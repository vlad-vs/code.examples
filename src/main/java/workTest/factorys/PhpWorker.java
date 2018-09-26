package workTest.factorys;

public class PhpWorker implements Worker {
    @Override
    public void doSomeWork() {
        System.out.println("Php worker do some task");
    }

    @Override
    public void createTask() {
        System.out.println("Php worker create some task");
    }
}
