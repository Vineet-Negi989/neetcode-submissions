/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp;
        if(root==null){
            return null;
        }
        invertTree(root.left);//the reason we didnt write int here because we cant save a treeNode variable in an int
        invertTree(root.right);
        //basically we are not storing them as another variables because if we store them as other variables then they would just point,Not change the actual tree we want to change the actual tree
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        return root;
    }
}
