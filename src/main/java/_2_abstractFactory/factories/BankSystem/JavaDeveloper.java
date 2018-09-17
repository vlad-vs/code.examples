package _2_abstractFactory.factories.BankSystem;

import _2_abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writrCode() {
        System.out.println("write java code");
    }
}
