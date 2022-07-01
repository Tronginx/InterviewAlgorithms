
import java.sql.Array;
import java.util.*;

public class GetKeysInBinaryTreeLayerByLayer {

    public class TreeNode {
        public int key;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int key) {
            this.key = key;
        }
    }

    public List<List<Integer>> layerByLayer(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> curLayer = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                curLayer.add(cur.key);
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            res.add(curLayer);
        }
        return res;
    }


    public static void main(String[] args) {
    }
}
