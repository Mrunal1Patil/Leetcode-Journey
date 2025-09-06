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

    boolean isleftToRight = true;

    while(!queue.isEmpty()){
        int levelSize = queue.size();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<levelSize;i++){
            TreeNode currentNode = queue.poll();
        if(isleftToRight){
            list.add(currentNode.val);
        }
        else{
            list.add(0,currentNode.val);
        }
        if(currentNode.left!=null){
            queue.offer(currentNode.left);
        }
        if(currentNode.right!=null){
            queue.offer(currentNode.right);
        }
        }
        result.add(list);
        isleftToRight=!isleftToRight;
    }
    return result;
    }
}