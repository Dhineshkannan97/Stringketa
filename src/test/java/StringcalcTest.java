import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringcalcTest {
    @Test
    void addTest() throws InvalidInputExp {
        assertEquals(3, Stringcalc.add("1,2"));
    }

    @Test
    void testEmptyString() throws InvalidInputExp {
        assertEquals(0, Stringcalc.add(""));
    }

    @Test
    void testSingleNum() throws InvalidInputExp {
        assertEquals(3, Stringcalc.add("3"));
    }

    @Test
    void testOnlyInt() throws InvalidInputExp {
        assertEquals(3, Stringcalc.add("3,A"));
    }

    @Test
    void testBothAlpha() throws InvalidInputExp {
        assertEquals(0, Stringcalc.add("A,A"));
    }

    @Test
    void testMixAlpha() throws InvalidInputExp {
        assertEquals(1, Stringcalc.add("1,3A"));
    }

    @Test
    void testDecimal() throws InvalidInputExp {
        assertEquals(1, Stringcalc.add("1,1.5"));
    }

    @Test
    void testMutiInt() throws InvalidInputExp {
        assertEquals(45, Stringcalc.add("45"));
    }

    @Test
    void testMutiInts() throws InvalidInputExp {
        assertEquals(100, Stringcalc.add("50,50"));
    }

    @Test
    void testAlphaWithInt() throws InvalidInputExp {
        assertEquals(61, Stringcalc.add("TEST34,61"));
    }

    @Test
    void testUnknownAmtOfNum() throws InvalidInputExp {
        assertEquals(2147483652L, Stringcalc.add("5,2147483647"));
    }

    @Test
    void testNegativeNum() throws InvalidInputExp {
        assertEquals(3, Stringcalc.add("3,-4"));
    }

    @Test
    void testIntWithMixAlpha() throws InvalidInputExp {
        assertEquals(5, Stringcalc.add("13A,5"));
    }

    @Test
    void testSymbol() throws InvalidInputExp {
        assertEquals(54, Stringcalc.add("54,$$"));
    }

    @Test
    void testMaxNum1() {
        assertThrows(ArithmeticException.class, () -> {
            var exc = Stringcalc.add("9223372036854775807,5");
        });
    }

    @Test
    void testMaxNum2() {
        assertThrows(NumberFormatException.class, () -> {
            var exc2 = Stringcalc.add("9223372036854775808,5");
        });
    }

    @Test
    void testMaxNum3() {
        assertThrows(NumberFormatException.class, () -> {
            Stringcalc.add("9223372036854775809,5");
        });
    }

    @Test
    void testMaxNum4() {
        assertThrows(ArithmeticException.class, () -> Stringcalc.add("9223372036854775806,5"));
    }
    @Test
    void line() throws InvalidInputExp {
        assertEquals(3, Stringcalc.add("1\n,2"));
    }

    @Test
    void line1() throws InvalidInputExp {
        assertEquals(3, Stringcalc.add("1,\n2"));
    }
    @Test
    void testMyExc1() throws InvalidInputExp {
        assertThrows(InvalidInputExp.class,()->Stringcalc.add("9223372036854775809,5"));
    }
}

