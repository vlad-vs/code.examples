package my.examples;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.google.common.collect.Lists;
import com.thoughtworks.xstream.io.json.JsonWriter;
import edu.emory.mathcs.backport.java.util.Arrays;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import jdk.nashorn.internal.parser.JSONParser;
import jdk.nashorn.internal.runtime.Context;
import my.examples.enums.Coffe;
import my.examples.сравнение_двух_листов.ReloadListToData;
import org.joda.time.LocalDateTime;

import javax.sound.midi.SoundbankResource;
import java.io.BufferedWriter;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Main {

    String s;
    String m;

    public static void main(String[] args) throws ParseException {
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



        GeozoneExistsType isExists = GeozoneExistsType.IS_EXISTS;
        System.out.println(isExists.b);

        System.out.println(isExists.isExist());



        long l = 1234567;
        double d = (double) l;
        System.out.println(d);

    }

    private static void chenge(Dog d){
     d.setName("name2");
     d = new Dog("name3");
     d.setName("name4");
//     return d;
    }

    public static class Dog {

        public Dog(String name) {
            this.name = name;
        }

        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public enum GeozoneExistsType {

        IS_EXISTS (true, "The current zone is open to the user"),
        NOT_EXIST (false, "The current zone is closed to the user");

        private boolean b;
        private String res;

        GeozoneExistsType(boolean b, String res) {
            this.b = b;
            this.res = res;
        }

        public boolean isExist(){
            return b;
        }
    }





}
