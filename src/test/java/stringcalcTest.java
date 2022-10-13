import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class stringcalcTest {
    @Test
    void addTest() {
        assertEquals(3, Stringcalc.add("1,2"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, Stringcalc.add(""));
    }

    @Test
    void testSingleNum() {
        assertEquals(3, Stringcalc.add("3"));
    }

    @Test
    void testOnlyInt() {
        assertEquals(3, Stringcalc.add("3,A"));
    }

    @Test
    void testBothAlpha() {
        assertEquals(0, Stringcalc.add("A,A"));
    }
}
