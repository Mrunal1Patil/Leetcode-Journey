class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxlength = 0;
        for(int num : nums){
            if(!set.contains(num-1)){
                int currentnum = num ;
                int currentlength = 1;

                while(set.contains(currentnum+1)){
                    currentnum = currentnum +1;
                    currentlength = currentlength +1;
                }
                maxlength = Math.max(currentlength , maxlength);
            }
        }
        return maxlength;
    }
}
