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
    public int closestValue(TreeNode root, double target) {
        int closest = root.val;
        TreeNode current = root;
         while (current != null) {
           
            if (Math.abs(current.val - target) < Math.abs(closest - target)) {
                closest = current.val;
            }else if (Math.abs(current.val - target) == Math.abs(closest - target) && current.val < closest) {
                closest = current.val;
            }

            if (target < current.val) {
                current = current.left;
            } else if (target > current.val) {
                current = current.right;
            } 
            else {
                break; 
            }
        }

        return closest;
    }
}