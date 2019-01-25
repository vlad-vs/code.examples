package my.examples.regularExpres;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class TestSequreTest {

    private TestSequre testSequre;

    @Before
    public void init(){
        testSequre = new TestSequre();
    }

    @Test
    public void getSequreEmplId_1() {
        String str = testSequre.getSequreEmplId("1234567890114444");
        assertEquals("123456******44441",str);
    }

    @Test
    public void getSequreEmplId_2() {
        String str = testSequre.getSequreEmplId("a1234567890114444");
        assertEquals("a1234567890114444",str);
    }

    @Test
    public void getSequreEmplId_3() {
        String str = testSequre.getSequreEmplId("0001234567890114444");
        assertEquals("0001234567890114444",str);
    }
}