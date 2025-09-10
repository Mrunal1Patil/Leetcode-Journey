class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        set.add(0);
        queue.add(0);

        while(!queue.isEmpty()){
            int room = queue.poll();
            for(int keys : rooms.get(room)){
                if(!set.contains(keys)){
                    queue.add(keys);
                    set.add(keys);
                }
            }
        }
        return set.size()==rooms.size();
    }
}