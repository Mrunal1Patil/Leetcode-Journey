class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
       
        if (n == 1) return nums[0];
      
        int[] dp = new int[n];
    
        dp[0] = nums[0];
        if (nums[1] > nums[0]) {
            dp[1] = nums[1];
        } else {
            dp[1] = nums[0];
        }
      
        for (int i = 2; i < n; i++) {
         
            if (nums[i] + dp[i - 2] > dp[i - 1]) {
                dp[i] = nums[i] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        
        return dp[n - 1];
    }
}