import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @org.junit.jupiter.api.Test
    void solve() {

        assertArrayEquals(new int[] {1},SelectionSort.solve(new int[] {1}));
        assertArrayEquals(new int[] {1,2,3},SelectionSort.solve(new int[] {3,2,1}));
        assertArrayEquals(new int[] {},SelectionSort.solve(new int[] {}));
        assertArrayEquals(new int[] {-1,0},SelectionSort.solve(new int[] {0,-1}));
        assertArrayEquals(new int[] {-1,0},SelectionSort.solve(new int[] {-1,0}));
        assertArrayEquals(new int[] {0,0},SelectionSort.solve(new int[] {0,0}));
        assertArrayEquals(new int[] {-3,-1,4,7},SelectionSort.solve(new int[] {-3,7,-1,4}));


    }
}