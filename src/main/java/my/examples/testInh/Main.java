package my.examples.testInh;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {

//        Pol one = new PolImpl();
//        Pol two = new PopLmplTwo();
//
//        List<Pol> list = new LinkedList();
//        list.add(one);
//        list.add(two);
//
//        for (Pol p : list) {
//            p.paint();
//        }

        PolImpl pol = new PolImpl();
        String s = pol.delChar("Hello",'l');
        System.out.println(s);
    }

}
