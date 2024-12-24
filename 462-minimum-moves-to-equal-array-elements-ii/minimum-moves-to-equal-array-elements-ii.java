class Solution {
    public int minMoves2(int[] nums) {
         Arrays.sort(nums);
        
       
        int median = nums[nums.length / 2];
        
        
        int moves = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > median) {
                moves += nums[i] - median;
            } else {
                moves += median - nums[i];
            }
        }
        
        return moves;
    }
}