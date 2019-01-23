package workTest.factorys;

public class PhpDevFactory implements WorkersFactory {

    @Override
    public Worker getInstanse() {
        return new PhpWorker();
    }
}
