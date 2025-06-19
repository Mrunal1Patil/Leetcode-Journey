class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
     int start =0;
     int minlength = Integer.MAX_VALUE;
     int currentSum = 0 ;

     for(int end=0;end<nums.length;end++){
        currentSum = currentSum + nums[end];

        while(currentSum>=target){
            minlength = Math.min(minlength , end-start+1);
            currentSum = currentSum-nums[start];
            start++;
        }
     }
     return (minlength == Integer.MAX_VALUE) ? 0 : minlength;
    } 
}