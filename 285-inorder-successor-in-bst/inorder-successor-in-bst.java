/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode successor = null;
        if(p.right!=null){
            successor = p.right;
            while(successor.left!=null){
                successor = successor.left;
            }
            return successor;
        }
        TreeNode ancestor = root;
        while(ancestor!=p){
            if(p.val<ancestor.val){
                successor=ancestor;
                ancestor=ancestor.left;
            }
            else{
                ancestor=ancestor.right;
            }
        }
        return successor;
    }
}