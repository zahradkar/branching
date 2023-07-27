import static org.junit.jupiter.api.Assertions.*;

class SortStringTest {

    @org.junit.jupiter.api.Test
    void order() {
        String s = "This is the best day";
        String s1 = "bet3 i2s Th1is d4ay";
        assertEquals("Th1is i2s bet3 d4ay", SortString.order(s1));
    }
}