package _2_abstractFactory.factories.webProJect;

import _2_abstractFactory.Developer;

public class PhpDev implements Developer {
    @Override
    public void writrCode() {
        System.out.println("php code..");
    }
}
