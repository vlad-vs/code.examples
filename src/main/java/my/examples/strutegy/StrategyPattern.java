package my.examples.strutegy;

public class StrategyPattern {


    public interface Strutegy{
        double getPrice(double price);
    }

    class FullPrice implements Strutegy{
        @Override
        public double getPrice(double price) {
            return price;
        }
    }


    static class HalfPrice implements Strutegy {
        @Override
        public double getPrice(double price) {
            return price * .5;
        }
    }

    static class Context {

        Strutegy strutegy;

        Context(Strutegy strutegy) {
            this.strutegy = strutegy;
        }

        double getPrice(double price) {
            return strutegy.getPrice(price);
        }

    }

    public static void main(String[] args) {
        Context context = new Context(new HalfPrice());
        double price = context.getPrice(500);
        System.out.println(price);
    }

}
