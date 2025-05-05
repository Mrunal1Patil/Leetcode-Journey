class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
Arrays.sort(nums);
        helper(nums, result, 0,current);
        return result;
    }

    public void helper(int[] nums, List<List<Integer>> result,int index,List<Integer> current){

        result.add(new ArrayList<>(current));

        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;

            current.add(nums[i]);
            helper(nums,result,i+1,current);
            current.remove(current.size()-1);
        }
    }

}