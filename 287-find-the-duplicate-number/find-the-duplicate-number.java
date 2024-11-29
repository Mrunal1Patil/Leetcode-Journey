class Solution {
    public int findDuplicate(int[] nums) {
       
      int start = 0;
      int end = nums.length-1;

      while(start<end){
        int middle = start + (end-start) /2;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=middle){
                count++;
            }
        }
        if(count>middle){
            end=middle;
        }
        else{
            start=middle+1;
        }
      }
      return start;
    }
}
