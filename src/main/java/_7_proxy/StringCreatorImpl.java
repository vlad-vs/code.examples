package _7_proxy;

public class StringCreatorImpl implements StringCreator {


    @Override
    public String createStr(String s) {
        System.out.println("From creator " + s);
        return s;
    }
}
