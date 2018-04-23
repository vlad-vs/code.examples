package my.examples.shablons;

public class MySingleton {

    private static MySingleton mySingleton = new MySingleton();

    String st;

    public MySingleton MySingleton() {
        return mySingleton;
    }

    public MySingleton setSt(String st) {
        this.st = st;
        return null;
    }

    public static MySingleton getMySingleton() {
        return mySingleton;
    }

    @Override
    public String toString() {
        return "MySingleton{" +
                "st='" + st + '\'' +
                '}';
    }


}




