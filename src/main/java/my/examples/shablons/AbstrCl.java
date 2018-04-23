package my.examples.shablons;

public abstract class AbstrCl {
    private int a = 5;
    void sayHello(){
        System.out.println("hello");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

}
