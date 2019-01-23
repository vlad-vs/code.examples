package my.examples.сравнение_двух_листов;

import my.examples.сравнение_двух_листов.DbMapper;

import java.util.List;

public class ReloadListToData <T extends Comparable> {


    public void update(List<T> oldObjList, List<T> nOdjList) {
        if (!nOdjList.isEmpty()) {
            for (T oldObj : oldObjList) {
                if (oldObj != null) {
                    if (!nOdjList.contains(oldObj)) {
                        System.out.println("del = " + oldObj);
                    }
                }
            }

            for (T newObj : nOdjList) {
                if (!oldObjList.contains(newObj)) {
                    System.out.println("add = "+newObj);
                }
            }

        } else {
            System.out.println("Error!!!!");
        }
    }
}
