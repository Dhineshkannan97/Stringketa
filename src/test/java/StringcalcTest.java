import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringcalcTest {
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
    @Test
    void testMixAlpha(){
        assertEquals(4,Stringcalc.add("1,3A"));
    }
    @Test
    void testDecimal(){
        assertEquals(1, Stringcalc.add("1,1.5"));
    }
    @Test
    void testMutiInt(){
        assertEquals(45,Stringcalc.add("45"));
    }
    @Test
    void testMutiInts(){
        assertEquals(100,Stringcalc.add("50,50"));
    }
    @Test
    void testAlphaWithInt(){
        assertEquals(95,Stringcalc.add ("TEST34,61"));
    }
}
