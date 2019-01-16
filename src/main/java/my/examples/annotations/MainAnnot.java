package my.examples.annotations;

@MyAnnot(ver = 1)
public class MainAnnot {

    public static void main(String[] args) throws RuntimeException {
        final int ver = MainAnnot.class.getAnnotation(MyAnnot.class).ver();
        System.out.println(ver);
        System.out.println(MainAnnot.class.getMethods()[0].getName());
    }
}
