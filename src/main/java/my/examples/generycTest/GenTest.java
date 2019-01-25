package my.examples.generycTest;

public class GenTest {

    public <T extends Comparable<?>> T test(T obj){

        return obj;
    }

}
