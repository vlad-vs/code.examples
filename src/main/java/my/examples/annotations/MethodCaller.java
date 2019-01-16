package my.examples.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MethodCaller {

    /*
     * @param isntance: instance which implemented the Caller interface
     */
    public static void callMethod(Caller instance)
            throws Exception {
        Method m = instance.getClass().getMethod("callMethod");
        Annotation as[] = m.getAnnotations();
        Catch li = null;
        for (Annotation a : as) {
            if (a.annotationType().equals(Catch.class)) {
                li = ((Catch) a);
            }
            // for(Catch cx:li){cx.targetException().getName();}
        }
        try {
            instance.callMethod();
        } catch (Throwable e) {
            Class<?> ec = e.getClass();
            if (li == null) {
                return;
            }
        }
    }

}
