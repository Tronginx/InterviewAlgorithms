import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloLaiofferTest {
    @Test
    void add() {
        assertEquals(4, HelloLaioffer.add(2, 2));
        assertEquals(0, HelloLaioffer.add(0, 0));
        assertEquals(-2, HelloLaioffer.add(-1, -1));
        assertEquals(Integer.MAX_VALUE, HelloLaioffer.add(Integer.MAX_VALUE-1, 1));
        assertEquals(1, HelloLaioffer.add(-1, 2));
    }
}