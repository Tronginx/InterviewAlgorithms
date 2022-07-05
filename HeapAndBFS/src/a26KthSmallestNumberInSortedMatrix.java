import java.util.Comparator;
import java.util.PriorityQueue;

public class a26KthSmallestNumberInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        // Write your solution here

        int rows = matrix.length;
        int columns = matrix[0].length;

        PriorityQueue<Cell> minHeap = new PriorityQueue<Cell>(k, new Comparator<Cell>(){
            @Override
            public int compare(Cell c1, Cell c2) {
                if (c1.val == c2.val) {
                    return 0;
                }
                return c1.val < c2.val ? -1 : 1;
            }
        });

        boolean[][] visited = new boolean[rows][columns];
        minHeap.offer(new Cell(0,0,matrix[0][0]));
        visited[0][0] = true;

        for (int i = 0; i < k - 1; i++) {
            Cell cur = minHeap.poll();
            if (cur.row + 1 < rows && !visited[cur.row+1][cur.column]) {
                minHeap.offer(new Cell(cur.row+1,cur.column,matrix[cur.row + 1][cur.column]));
                visited[cur.row + 1][cur.column] = true;
            }
            if (cur.column + 1 < columns && !visited[cur.row][cur.column + 1]) {
                minHeap.offer(new Cell(cur.row, cur.column + 1, matrix[cur.row][cur.column+1]));
                visited[cur.row][cur.column+1] = true;
            }
        }
        return minHeap.peek().val;

    }

    static class Cell {
        int row;
        int column;
        int val;

        Cell(int row, int column, int val) {
            this.row = row;
            this.column = column;
            this.val = val;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{ {1,  3,   5,  7}, {2,  4,   8,   9}, {3,  5, 11, 15}, {6,  8, 13, 18} };

        a26KthSmallestNumberInSortedMatrix sol = new a26KthSmallestNumberInSortedMatrix();
        int res = sol.kthSmallest(matrix, 5);

        System.out.println(res);
    }
}
