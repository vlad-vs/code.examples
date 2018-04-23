package my.examples.shablons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.UnaryOperator;

public class CollectionSimetric {

    public static <T> Collection<T> sumDiff (Collection<T> a, Collection<T> b){
        Collection<T> result = new ArrayList<>(a);

        System.out.println("result " + result);

        Collection<T> temp = new ArrayList<>(a);

        System.out.println("temp " + temp);

//        (temp).replaceAll(b);
        System.out.println("temp + replace " + temp);

        result.addAll(b);
        System.out.println("result + add all b" + temp);

        result.removeAll(temp);
        System.out.println("fin " + result);
        return result;
    }
}
