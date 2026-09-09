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
    public int Difference(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Difference(root.left);
        int right=Difference(root.right);
        return 1+Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
     if(root==null){
        return true;
     }
          boolean currentbalanced;
        if (Math.abs(Difference(root.left) - Difference(root.right)) <= 1
        )
         currentbalanced=true;
        else{
           currentbalanced= false;
        }
        return isBalanced(root.left) && isBalanced(root.right) && currentbalanced;
    }
}
