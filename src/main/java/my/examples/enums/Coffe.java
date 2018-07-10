package my.examples.enums;

public class Coffe {

    public enum CoffeSize {

        SMALL(100),
        MEDIUM(200),
        LARG(300);
        int mll;

        CoffeSize(int mll) {
            this.mll = mll;
        }

        public int getMll() {
            return mll;
        }
    };

}
