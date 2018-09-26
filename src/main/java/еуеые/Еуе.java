package еуеые;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Streams;

import java.util.List;
import java.util.stream.Stream;

public class Еуе {

    public static void main(String[] args) {

        List<String> strings1 = Lists.newArrayList("1", "2", "3");

        List<String> strings2 = Lists.newArrayList("2", "5"); // true
        List<String> strings3 = Lists.newArrayList("6"); // false

        long count = strings1.stream().filter(o -> strings2.contains(o)).count();
        System.out.println(count);

        boolean b = strings1.containsAll(strings2);

        System.out.println(b);
        System.out.println(strings1);

        Stream<String> stream1 = strings1.stream();
        Stream<String> stream2 = strings2.stream();
    }

}
