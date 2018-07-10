package my.examples.patterns;

import my.examples.patterns.factoryMethod.AbstructTransport;
import my.examples.patterns.factoryMethod.Factory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        System.out.println(factory.getTransport("Auto"));
        System.out.println(factory.getTransport("Train"));
        AbstructTransport auto = factory.getTransport("Auto");
        auto.hello();
        factory.getTransport("Auto").muve();
        factory.getTransport("Train").hello();
        factory.getTransport("Train").muve();
    }
}
