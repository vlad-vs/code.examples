package my.examples.hash;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HeshTest hesh1 = new HeshTest("Tom", 20);
        HeshTest hesh2 = new HeshTest("Jon", 30);
        HeshTest hesh3 = new HeshTest("Mick", 30);
        HeshTest hesh4 = new HeshTest("Tomw", 20);

        System.out.println(hesh1.hashCode());
        System.out.println(hesh2.hashCode());
        System.out.println(hesh3.hashCode());
        System.out.println(hesh4.hashCode());

        Map<String, HeshTest> map = new HashMap();
        map.put("1", hesh1);
        map.put("2", hesh2);
        map.put("3", hesh3);
        map.put("4", hesh4);

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());
        }

        System.out.println("");

        map.forEach((o, o2) -> System.out.println(o.toString() + "  " + o2.toString()));

    }
}
