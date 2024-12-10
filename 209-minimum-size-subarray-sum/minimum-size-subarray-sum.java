class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
       int minlength = Integer.MAX_VALUE;
       int start = 0;
       int currentSum = 0;
       
       for(int end = 0 ;end<nums.length;end++){
        currentSum = currentSum + nums[end];
        while(currentSum>=target){
            if(minlength> end - start + 1){
                minlength = end - start + 1;
            }
            currentSum = currentSum - nums[start];
            start++;
        }
       }
       if(minlength== Integer.MAX_VALUE){
        return 0;
       }
       return minlength;
    }
}