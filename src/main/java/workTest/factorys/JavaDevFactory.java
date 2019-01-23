package workTest.factorys;

public class JavaDevFactory implements WorkersFactory {

    @Override
    public Worker getInstanse() {
        return new JavaWorker();
    }
}
