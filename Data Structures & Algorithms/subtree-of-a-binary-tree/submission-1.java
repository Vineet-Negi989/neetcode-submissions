



class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // If subRoot is null, it is always a subtree
        if (subRoot == null) {
            return true;
        }

        // If root is null but subRoot isn't, no subtree exists
        if (root == null) {
            return false;
        }

        // Check if trees are identical starting from this node
        if (isSameTree(root, subRoot)) {
            return true;
        }

        // Search in the left or right subtree
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }


    // Checks whether two trees are exactly the same
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Both are null -> same
        if (p == null && q == null) {
            return true;
        }

        // One is null -> different
        if (p == null || q == null) {
            return false;
        }

        // Values are different -> different
        if (p.val != q.val) {
            return false;
        }

        // Both left and right subtrees must also be same
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}


