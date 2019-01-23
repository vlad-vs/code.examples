package my.examples.internString;

import javax.sound.midi.SoundbankResource;
import java.lang.ref.WeakReference;

public class IsternStringMain {

    public static void main(String[] args) {
        String  s1 = "String";
        String  s2 = "String";

        String  s3 = new String("String");

        String  s4 = new String("new String");

        System.out.println("s1 == s2 = " + (s1 == s2));
        System.out.println("s1 == s3 = " + (s1 == s3));
        System.out.println("==========================");
        System.out.println("s1 equals s2 = "+s1.equals(s2));
        System.out.println("s1 equals s3 = "+s1.equals(s3));
        final boolean b = s1.intern() == s3.intern();

        System.out.println(b);

        System.out.println("s1 intern s3 = " + (s1.intern() == s3.intern()));
        System.out.println("s1 intern s4 = " + (s1.intern() == s4.intern()));

//        WeakReference<String> ref1 = new WeakReference<String>("string");
//        System.gc();
//        System.out.println(ref1.get());
//
//
//        String str = "str";
//        WeakReference<String> ref2 = new WeakReference<String>((str + "ing").intern());
//        System.gc();
//        System.out.println(ref2.get());
    }
}
