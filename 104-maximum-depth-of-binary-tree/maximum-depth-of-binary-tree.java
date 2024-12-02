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
    public int maxDepth(TreeNode root) {
        
      if(root==null){
        return 0;
      }
    
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    int depth=0;
    while(!queue.isEmpty()){
        int levelSize = queue.size();
        depth++;
        for(int i=0;i<levelSize;i++){
          TreeNode currentNode = queue.poll();
          if(currentNode.left!=null){
            queue.add(currentNode.left);
          }
          if(currentNode.right!=null){
            queue.add(currentNode.right);
          }
        }
    }
    return depth;
      
    }
}