package my.examples.patterns.factoryMethod;

public class Factory {

    public AbstructTransport getTransport(String o){
        AbstructTransport transport = null;
        if(o.equals("Train")) {
            transport = new Train();
        }
        if (o.equals("Auto")) {
            transport = new Auto();
        }
        return transport;
    }
}
