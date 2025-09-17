class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length!=n-1) return false;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            map.get(u).add(v);
            map.get(v).add(u);

        }
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        set.add(0);
        queue.offer(0);

        while(!queue.isEmpty()){
            int node = queue.poll();
            for(int nei : map.get(node)){
                if(!set.contains(nei)){
                    set.add(nei);
                    queue.offer(nei);
                    map.get(nei).remove((Integer)node);
                }
            }
        }
        return set.size()==n;
    }
}
