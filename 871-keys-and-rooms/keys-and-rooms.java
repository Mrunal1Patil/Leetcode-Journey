class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
      
      Set<Integer> set = new HashSet<>();
      Queue<Integer> queue = new LinkedList<>();

      queue.offer(0);
      set.add(0);

      while(!queue.isEmpty()){
        int roomkey = queue.poll();

        for(int room : rooms.get(roomkey)){
            if(!set.contains(room)){
                set.add(room);
                queue.offer(room);
            }
        }
      }
        return rooms.size()==set.size();
    }
}