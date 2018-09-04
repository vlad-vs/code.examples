package my.examples;

import com.google.common.collect.Lists;
import edu.emory.mathcs.backport.java.util.Arrays;
import my.examples.enums.Coffe;

import java.util.Collections;
import java.util.List;

public class Main {

    String s;
    String m;

    public static void main(String[] args) {
        Coffe coffe = new Coffe();
        Coffe.CoffeSize.MEDIUM.getMll();


        List<Integer> list1 = Lists.newArrayList(1,2,3);
        List<Integer> list2 = Lists.newArrayList(4,5,6);
        List<Integer> list3 = Lists.newArrayList(7,8,9);

        String s = "4,5,6";

        Collections.addAll(list1);

        System.out.println(list1);


        List<List<Integer>> lists = java.util.Arrays.asList(
                Collections.singletonList(2),
                Collections.singletonList(3),
                java.util.Arrays.asList(2, 3));
        
        System.out.println(lists);

    }


}
