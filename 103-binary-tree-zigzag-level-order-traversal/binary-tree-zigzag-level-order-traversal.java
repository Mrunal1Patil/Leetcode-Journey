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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;

        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode current = queue.poll();
                if(leftToRight){
                    list.add(current.val);
                }
                else{
                    list.add(0,current.val);
                }
                if(current.left!=null){
                    queue.offer(current.left);
                }
                 if(current.right!=null){
                    queue.offer(current.right);
                }
               
            }
            result.add(list);
             leftToRight=!leftToRight;
        }
        return result;
    }
}