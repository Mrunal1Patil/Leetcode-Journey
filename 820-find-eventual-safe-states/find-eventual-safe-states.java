class Solution {

    private boolean isNodeSafe(int node, int[][] graph , int[] state){
        if(state[node]==1){
            return false;
        }

        if(state[node]==2){
            return true;
        }

        state[node]=1;

        for(int neighbor : graph[node]){
            if(!isNodeSafe(neighbor,graph,state)){
                return false;
            }
        }

        state[node] = 2;
        return true;

    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        List<Integer> result = new ArrayList<>();

        int[] state = new int[graph.length];

        for(int node=0;node<graph.length;node++){
            if(isNodeSafe(node,graph,state)){
                result.add(node);
            }
        }
        return result;
    }
}