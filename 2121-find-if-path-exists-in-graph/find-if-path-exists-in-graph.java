class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {  
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            map.get(u).add(v);
            map.get(v).add(u);
        }

        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(source);
        set.add(source);

        while(!queue.isEmpty()){
            int node = queue.poll();
            if(node==destination){
                return true;
            }
            for(int neighbor : map.get(node)){
                if(!set.contains(neighbor)){
                    set.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        return false;
    }
}