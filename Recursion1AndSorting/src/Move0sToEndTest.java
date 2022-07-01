import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Move0sToEndTest {

    @Test
    void moveZero() {
        assertArrayEquals(new int[] {1},Move0sToEnd.moveZero(new int[] {1}));
        assertArrayEquals(new int[] {},Move0sToEnd.moveZero(new int[] {}));
        assertArrayEquals(new int[] {-1,0},Move0sToEnd.moveZero(new int[] {0,-1}));
        assertArrayEquals(new int[] {-1,0},Move0sToEnd.moveZero(new int[] {-1,0}));
        assertArrayEquals(new int[] {0,0},Move0sToEnd.moveZero(new int[] {0,0}));
       // assertArrayEquals(new int[] {-3,-1,4,7,0,0},Move0sToEnd.moveZero(new int[] {-3,7,0,0,-1,4}));
    }
}