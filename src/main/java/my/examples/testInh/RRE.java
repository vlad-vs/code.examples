package my.examples.testInh;

public class RRE {

    public static void main(String[] args) {

        BoxPrinter<String> boxPrinter = new BoxPrinter<>();
        boxPrinter.setT("Vlad");
        System.out.println(boxPrinter);
        boxPrinter.sayHello();

    }

    static void ar(int a) {
        assert (a % 2 > 0);


        System.out.println("ansver =" + a);
    }

    static class BoxPrinter<T>{
        private T t;

        public void sayHello(){
            System.out.println("hello");
        }

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }

        @Override
        public String toString() {
            return "BoxPrinter{" +
                    "t=" + t +
                    '}';
        }
    }

}
