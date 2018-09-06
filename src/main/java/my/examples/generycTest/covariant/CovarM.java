package my.examples.generycTest.covariant;

import com.google.common.collect.Lists;

import java.util.ArrayList;

public class CovarM {

    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<Object>();
//        инвариантность  дженериков
//        ArrayList<Object> objects = new ArrayList<String>();

        ArrayList<Number> integers = Lists.newArrayList();
        integers.add(new Long(5));

        String d = "Hello";

        ArrayList<? super Object> integers2 = Lists.newArrayList();
        integers2.add(d);
        Object o = integers2.get(0);
        System.out.println("====1======" + integers2.get(0));


//        ArrayList<Object> objects = Lists.newArrayList("String",1);
//
//        System.out.println(objects.get(0));//string
//        System.out.println(objects.get(1));//int


//        ковариантность массивов
        Object[] objectsArr1 = new String [3];
        objectsArr1[0] = new Object();
        objectsArr1[1] = "hello";
        objectsArr1[2] = 1;
        System.out.println(objectsArr1[1]);

        Object[] objectsArr2 = new Object[3];
        objectsArr2[0] = new Object();
        objectsArr2[1] = "hello";
        objectsArr2[2] = 1;
        System.out.println(objectsArr2[1]);

    }
}
