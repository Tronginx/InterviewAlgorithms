import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeSort() {
        assertArrayEquals(new int[] {1},MergeSort.mergeSort(new int[] {1}));
        assertArrayEquals(new int[] {1,2,3},MergeSort.mergeSort(new int[] {3,2,1}));
        assertArrayEquals(new int[] {1,2,3},MergeSort.mergeSort(new int[] {1,2,3}));
        assertArrayEquals(new int[] {},MergeSort.mergeSort(new int[] {}));
        assertArrayEquals(new int[] {-1,0},MergeSort.mergeSort(new int[] {0,-1}));
        assertArrayEquals(new int[] {-1,0},MergeSort.mergeSort(new int[] {-1,0}));
        assertArrayEquals(new int[] {0,0},MergeSort.mergeSort(new int[] {0,0}));
        assertArrayEquals(new int[] {-3,-1,4,7},MergeSort.mergeSort(new int[] {-3,7,-1,4}));
    }
}