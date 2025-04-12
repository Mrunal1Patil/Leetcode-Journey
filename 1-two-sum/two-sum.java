class Solution {
    public int[] twoSum(int[] nums, int target) {
     
     HashMap<Integer,Integer> hm = new HashMap<>();

     for(int i=0;i<nums.length;i++){
        int current = nums[i];
        int complement = target-current;

        if(hm.containsKey(complement)){
            return new int[]{hm.get(complement), i};
        }
        hm.put(current,i);
     }
     return new int[]{};
    }
   }

