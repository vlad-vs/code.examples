package my.examples.сравнение_двух_листов;

import com.google.common.collect.Lists;

import java.util.ArrayList;

public class ReloadListToDataTest {


    public static void main(String[] args) {

        ReloadListToData listToData = new ReloadListToData();

        ArrayList<Integer> integers1 = Lists.newArrayList(1, 2, 3);
        ArrayList<Integer> integers2 = Lists.newArrayList(3, 4);

        listToData.update(integers1, integers2);

    }

}
