class Solution {
    public int lastStoneWeight(int[] stones) {
       
       PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);

       for(int n : stones){
        pq.add(n);
       }

       while(pq.size()>1){
        int s1 = pq.poll();
        int s2 = pq.poll();

        if(s1!=s2){
            pq.add(s1-s2);
        }

       }
       if(pq.isEmpty()){
        return 0;
       }
       return pq.peek();
    }
}