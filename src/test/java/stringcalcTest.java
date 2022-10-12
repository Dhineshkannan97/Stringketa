import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class stringcalcTest {
@Test
    void addTest(){
    assertEquals(3, Stringcalc.add("1,2"));
}
@Test
    void testEmptyString(){
    assertEquals(0,Stringcalc.add(""));
}

}
