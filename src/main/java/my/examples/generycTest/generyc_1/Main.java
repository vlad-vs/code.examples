package my.examples.generycTest.generyc_1;

import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ClasA clasA = new ClasA(1,"A");
        List<ClasA> clasAList = Lists.newArrayList(clasA);
        ClasB clasB = new ClasB(2,"B");
        List<ClasB> clasBList = Lists.newArrayList(clasB);

        List<WorkInterface> list = Lists.newArrayList(clasB,clasA);

        Wrapper wrapper = new Wrapper();
        wrapper.getMaxId(clasAList);
        wrapper.getMaxId(clasBList);
        wrapper.getMaxId(list);

        getMaxId(clasAList);
        getMaxId(clasBList);
        getMaxId(list);
    }



    private static void getMaxId(List<? extends WorkInterface> list){
        if (!list.isEmpty()) {
            WorkInterface workInterface = list.stream().max(Comparator.comparing(WorkInterface::getId)).get();
            System.out.println(workInterface.getName());
        }


    }

}
