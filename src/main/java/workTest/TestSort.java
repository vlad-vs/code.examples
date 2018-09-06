package workTest;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestSort {

    public static void main(String[] args) {

        ClasA a = new ClasA(1,"A");

        List<ClasA> objects = Lists.newArrayList(a);

        Optional<ClasA> max = objects.stream().max(Comparator.comparing(ClasA::getId));

        System.out.println();
    }

}
