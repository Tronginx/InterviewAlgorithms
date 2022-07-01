import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void quickSort() {
        assertArrayEquals(new int[] {1},QuickSort.quickSort(new int[] {1}));
        assertArrayEquals(new int[] {1,2,3},QuickSort.quickSort(new int[] {3,2,1}));
        assertArrayEquals(new int[] {},QuickSort.quickSort(new int[] {}));
        assertArrayEquals(new int[] {-1,0},QuickSort.quickSort(new int[] {0,-1}));
        assertArrayEquals(new int[] {-1,0},QuickSort.quickSort(new int[] {-1,0}));
        assertArrayEquals(new int[] {0,0},QuickSort.quickSort(new int[] {0,0}));
        assertArrayEquals(new int[] {-3,-1,4,7},QuickSort.quickSort(new int[] {-3,7,-1,4}));
    }
}