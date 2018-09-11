package my.examples.generycTest.generyc_1;

import java.util.Comparator;
import java.util.List;

public class Wrapper <T extends WorkInterface> {


    void doSome(List<T> list){
        if (!list.isEmpty()) {
            T t = list.stream().max(Comparator.comparing(WorkInterface::getId)).get();
            System.out.println(t.getName());
        }


    }

}
