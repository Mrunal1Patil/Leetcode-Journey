class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
       Queue<Integer> queue = new LinkedList<>();
       Set<Integer> set = new HashSet<>();

       queue.add(0);
       set.add(0);

       while(!queue.isEmpty()){
        int room = queue.poll();

        for(int key : rooms.get(room)){
            if(!set.contains(key)){
                queue.offer(key);
                set.add(key);
            }
        }

       }
       return rooms.size() == set.size();
    }
}