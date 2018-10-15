import org.junit.Test;

import static org.junit.Assert.*;

public class twoStringTest {

    @Test
    public void alternateString1() {
        String result = twoString.alternateStrings("abc", "xyz");
        assertEquals("axbycz", result);
    }
    @Test
    public void alternateString2() {
        String result = twoString.alternateStrings("Hi", "There");
        assertEquals("HTihere", result);
    }
    @Test
    public void alternateString3() {
        String result = twoString.alternateStrings("xxxx", "Thereee");
        assertEquals("xTxhxexreee", result);
    }
    @Test
    public void alternateString4() {
        String result = twoString.alternateStrings("abc", "xyz");
        assertEquals("Txhxexrxeee", result);
    }
    @Test
    public void alternateString5() {
        String result = twoString.alternateStrings(" ", " ");
        assertEquals("  ", result);
    }

    @Test
    public void abcTest1() {
        boolean result = twoString.abcTest("123abc");
        assertEquals(true, result);

    }

    @Test
    public void abcTest2() {
        boolean result = twoString.abcTest("123.abc");
        assertEquals(false, result);

    }

    @Test
    public void abcTest3() {
        boolean result = twoString.abcTest("abc.123");
        assertEquals(true, result);

    }

    @Test
    public void abcTest4() {
        boolean result = twoString.abcTest("");
        assertEquals(false, result);

    }
}