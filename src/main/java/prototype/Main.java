package prototype;

public class Main {
    public static void main(String[] args) {
        CopyObject object = new CopyObject("Hello");
        CopyObject object2 = (CopyObject) object.copy();
        System.out.println(object);
        System.out.println(object2);
    }
}
