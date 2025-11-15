class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(nums,0,current, answer);
        return answer;


    }

    void helper(int[] nums, int index, List<Integer> current, List<List<Integer>> answer){

        if(index == nums.length){
            answer.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        helper(nums, index+1,current,answer);

        current.remove(current.size()-1);
        while(index+1<nums.length && nums[index]==nums[index+1]){
            index++;
        }
        helper(nums,index+1,current, answer);
    }

}