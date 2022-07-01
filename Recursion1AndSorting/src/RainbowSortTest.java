import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RainbowSortTest {

    @Test
    void rainbowSort() {
        assertArrayEquals(new int[] {1},RainbowSort.rainbowSort(new int[] {1}));
        assertArrayEquals(new int[] {1,1,1},RainbowSort.rainbowSort(new int[] {1,1,1}));
        assertArrayEquals(new int[] {-1,0,1},RainbowSort.rainbowSort(new int[] {1,-1,0}));
        assertArrayEquals(new int[] {},RainbowSort.rainbowSort(new int[] {}));
        assertArrayEquals(new int[] {-1,0},RainbowSort.rainbowSort(new int[] {0,-1}));
        assertArrayEquals(new int[] {-1,0},RainbowSort.rainbowSort(new int[] {-1,0}));
        assertArrayEquals(new int[] {0,0},RainbowSort.rainbowSort(new int[] {0,0}));
        assertArrayEquals(new int[] {-1,0,1,1},RainbowSort.rainbowSort(new int[] {1,1,-1,0}));
    }
}