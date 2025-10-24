class Solution {
    public int[] searchRange(int[] nums, int target) {
     
     int first = firstSearch(nums, target);
     int last = lastSearch(nums, target);
     return new int[]{first,last};

       
    }
    int firstSearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while(start<=end){
            int middle = start + (end - start) / 2;
            if(nums[middle]==target){
                ans = middle;
                end = middle - 1;
            }
            else if(nums[middle]<target){
                start = middle + 1;
            }
            else end = middle-1;
        }
        return ans;
    }

    int lastSearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while(start<=end){
            int middle = start + (end - start) / 2;
            if(nums[middle]==target){
                ans = middle;
                start = middle + 1;
            }
            else if(nums[middle]<target){
                start = middle + 1;
            }
            else end = middle-1;
        }
        return ans;
    }
}