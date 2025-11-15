class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<Integer> current = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
       
       helper(nums,current,0,answer);
       return answer;



    }   
   void helper(int[] nums, List<Integer> current, int index, List<List<Integer>> answer){

    if(index==nums.length){
        answer.add(new ArrayList<>(current));
        return;
    }

    current.add(nums[index]);
    helper(nums,current,index+1,answer);
    current.remove(current.size()-1);
    helper(nums,current,index+1,answer);

   }
    
    
}