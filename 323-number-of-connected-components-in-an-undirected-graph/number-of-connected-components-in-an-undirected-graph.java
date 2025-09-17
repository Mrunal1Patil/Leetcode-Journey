class Solution {
    public int countComponents(int n, int[][] edges) {
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());

        }
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];
            map.get(u).add(v);
            map.get(v).add(u);
        }

        Set<Integer> set = new HashSet<>();
        int componentcount = 0;

        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                componentcount++;
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(i);
                set.add(i);

                while(!queue.isEmpty()){
                    int node = queue.poll();
                    for(int niegb : map.get(node)){
                        if(!set.contains(niegb)){
                            set.add(niegb);
                            queue.offer(niegb);
                        }
                    }
                }
            }
        }
        return componentcount;
    }
}