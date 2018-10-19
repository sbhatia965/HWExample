import org.junit.Test;

import static org.junit.Assert.*;

public class TwoStringsTest {
    @Test
    public void abcTest1() {
        boolean result = TwoStrings.abcTest("123abc");
        assertEquals(true, result);
    }
    @Test
    public void abcTest2() {
        boolean result = TwoStrings.abcTest("abc.123");
        assertEquals(true, result);
    }
    @Test
    public void abcTest3() {
        boolean result = TwoStrings.abcTest("123.abc");
        assertEquals(false, result);
    }
    @Test
    public void abcTest4() {
        boolean result = TwoStrings.abcTest("");
        assertEquals(true, result);
    }

    @Test
    public void alternateStringsTest1() {
        String result = TwoStrings.alternateStrings("abc", "xyz");
        assertEquals("axbycz", result);
    }
    @Test
    public void alternateStringsTest2() {
        String result = TwoStrings.alternateStrings("Hi", "There");
        assertEquals("HTihere", result);
    }
    @Test
    public void alternateStringsTest3() {
        String result = TwoStrings.alternateStrings("xxxx", "Thereee");
        assertEquals("xTxhxexreee", result);
    }
    @Test
    public void alternateStringsTest4() {
        String result = TwoStrings.alternateStrings("", "xyz");
        assertEquals("xyz", result);
    }

}