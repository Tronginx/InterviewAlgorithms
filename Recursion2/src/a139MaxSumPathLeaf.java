

public class a139MaxSumPathLeaf {


    public int findMax(TreeNode root, int[] max) {

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.key;
        }

        int leftGain = findMax(root.left, max);
        int rightGain = findMax(root.right, max);

        if (root.left != null && root.right != null) {
            int newPathGain = root.key + leftGain + rightGain;
            max[0] = Math.max(max[0], newPathGain);
            return root.key + Math.max(leftGain, rightGain);
        }

        return root.left == null ? rightGain + root.key : leftGain + root.key;


    }

}
