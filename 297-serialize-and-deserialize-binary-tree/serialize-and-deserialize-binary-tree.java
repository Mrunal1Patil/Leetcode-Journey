/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializehelper(root,sb);
        return sb.toString();
    }
    public void serializehelper(TreeNode node , StringBuilder sb){
        if(node==null){
            sb.append("#,");
            return;
        }
        sb.append(node.val).append(",");
        serializehelper(node.left,sb);
        serializehelper(node.right,sb);
    }

   private Queue<String> nodes;
    
    public TreeNode deserialize(String data) {
        nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        return deserializeHelper();
    }
    
    private TreeNode deserializeHelper() {
        if (nodes.isEmpty()) return null;
        
        String val = nodes.poll();
        if (val.equals("#")) return null;  
        
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = deserializeHelper();  
        node.right = deserializeHelper(); 
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));