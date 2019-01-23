package my.examples.annotations.classesForTest;

import javax.sound.midi.SoundbankResource;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainReflex {

    public static void main(String[] args) {

        Cat cat = new Cat("Tom",3);
        Dog dog = new Dog("Max",5);

        final Method[] methods = cat.getClass().getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        try {
            final Method say1 = Animal.class.getDeclaredMethod("say");
//            final Method say2 = Animal.class.getDeclaredMethod("screem");

            say1.setAccessible(true);
//            say2.setAccessible(true);

            say1.invoke(dog);
//            say2.invoke(dog);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println("=================================================");

        final Field[] declaredFields = cat.getClass().getDeclaredFields();
        for (Field declaredMethod : declaredFields) {
            System.out.println(declaredMethod.getName());
        }


        final Field[] declaredFields1 = cat.getClass().getSuperclass().getDeclaredFields();
        for (Field declaredField : declaredFields1) {

            declaredField.setAccessible(true);
            System.out.println(declaredField.getName());
        }
        try {
            System.out.println(declaredFields1[0].get(cat));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            final Field name = cat.getClass().getSuperclass().getDeclaredField("name");
            final String sName = (String) name.get(cat);
            System.out.println(sName);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
