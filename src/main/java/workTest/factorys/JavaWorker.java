package workTest.factorys;

public class JavaWorker implements Worker {
    @Override
    public void doSomeWork() {
        System.out.println("Java worker do some task");
    }

    @Override
    public void createTask() {
        System.out.println("Java worker create some task");
    }
}
