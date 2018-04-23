package my.examples.enums;

public enum CoffeSizeEnum {

    SMALL(100),
    MEDIUM(200),
    LARG(300);
    private int mll;

    CoffeSizeEnum(int mll) {
        this.mll = mll;
    }

    public int getMll() {
        return mll;
    }
};
