package my.examples.abstructClasess;

public class MainAbstruct {
    public static void main(String[] args) {
        AbstrCl a = new AbstrCl() {

            @Override
            void sayHello() {
                super.sayHello();
            }
        };

        a.sayHello();
        System.out.println(a.getA());
    }
}
