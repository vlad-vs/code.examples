package my.examples.shablons;

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        TestSingl m1 = TestSingl.getInstance();
        m1.setName("vlad");
        TestSingl m2 = TestSingl.getInstance();

        System.out.println(m1);
        System.out.println(m2);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        boolean list = list1.retainAll(list2);
        System.out.println(list);
        System.out.println(list1);

        TreeSet set = new TreeSet(list1);
        set.addAll(list2);
        ArrayList list4 = new ArrayList(Arrays.asList(set.toArray()));
        System.out.println(set);
        System.out.println(list4);
//        Collection<String> s = sumDiff(list1,list2);

        AbstrCl a = new AbstrCl() {

            @Override
            void sayHello() {
                super.sayHello();
            }
        };

        a.sayHello();
        System.out.println(a.getA());

        System.out.println(Cat.Leopard);
    }

}
