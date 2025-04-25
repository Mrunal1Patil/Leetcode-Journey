class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int[] nums, List<Integer> currentSubset, List<List<Integer>> result) {
        result.add(new ArrayList<>(currentSubset));

        for (int i = start; i < nums.length; i++) {
           
            if (i > start && nums[i] == nums[i - 1]) continue;

            currentSubset.add(nums[i]);                  
            backtrack(i + 1, nums, currentSubset, result); 
            currentSubset.remove(currentSubset.size() - 1); 
        }
    }
}