class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
      
        int[] ans = new int[nums.length];
          ans[0] = sum;
        for(int i=0;i<nums.length;i++){
            ans[i]=sum+nums[i];
            sum=ans[i];
        }
        return ans;
    }
    }