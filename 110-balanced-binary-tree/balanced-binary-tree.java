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
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    private int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int lefth = height(node.left);
        if(lefth==-1){
            return -1;
        }
        int  righth = height(node.right);
        if(righth==-1){
            return -1;
        }
        if(lefth-righth>1 || righth-lefth>1){
            return -1;
        }
        int h;
        if(lefth>righth){
            h=lefth +1;
        }
        else{
            h=righth+1;
        }
        return h;
    }
}