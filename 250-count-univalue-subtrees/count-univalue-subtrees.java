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
    int count = 0;
    public int countUnivalSubtrees(TreeNode root) {
        unival(root);
        return count;
    }
    public boolean unival(TreeNode node){
        if(node==null){
            return true;
        }
        boolean left = unival(node.left);
        boolean right = unival(node.right);
        if(left&& right){
            if(node.left!=null && node.left.val!=node.val){
                return false;
            }
            if(node.right!=null && node.right.val!=node.val){
                return false;
            }
            count ++;
            return true;
        }
        return false;
    }

}