//package my.examples.AutoValue;
//
//import static org.junit.Assert.*;
//
//public class AutoValueMAin {
//
//
//    public static void main(String[] args) {
//
//        Animal dog = Animal.create("dog", 4);
//
//        final String name = dog.name();
//        System.out.println(name);
//
//        assertEquals("dog", dog.name());
//        assertEquals(4, dog.numberOfLegs());
//
//        // You probably don't need to write assertions like these; just illustrating.
//        assertTrue(Animal.create("dog", 4).equals(dog));
//        assertFalse(Animal.create("cat", 4).equals(dog));
//        assertFalse(Animal.create("dog", 2).equals(dog));
//
//        assertEquals("Animal{name=dog, numberOfLegs=4}", dog.toString());
//        
//    }
//}
