package my.examples.reflection;

import javax.sound.midi.SoundbankResource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainReflect {


    public static void main(String[] args) {
        MyClass myClass = new MyClass(1,"Vlad");

        try {
            Method getName = myClass.getClass().getDeclaredMethod("getName");
            getName.setAccessible(true);
            String  val = (String)getName.invoke(myClass);
            System.out.println(val);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
            Method getName = myClass.getClass().getDeclaredMethod("calc", int.class, int.class);
            getName.setAccessible(true);
            Integer val = (Integer) getName.invoke(myClass, 1, 2);
            System.out.println(val);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        final Class<?>[] interfaces = myClass.getClass().getInterfaces();
        System.out.println(interfaces);


    }


}
