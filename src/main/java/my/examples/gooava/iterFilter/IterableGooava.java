package my.examples.gooava.iterFilter;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IterableGooava {

    public static void main(String[] args) {



        IterBClass iterBClass = new IterBClass("B");
        IterAClass iterAClass = new IterAClass("A");


        ArrayList<IterInter> iters = Lists.newArrayList(iterBClass,iterAClass);

        // фильтр для Iterable
        Iterable<IterAClass> filter1 = Iterables.filter(iters, IterAClass.class);
        List<IterAClass> iterAClasses = Lists.newArrayList(filter1);
        filter1.forEach(System.out::println);

        // фильтр java 8
        List<IterInter> collect = iters.stream().filter((IterAClass.class)::isInstance).collect(Collectors.toList());
        collect.forEach(System.out::println);

    }

}
