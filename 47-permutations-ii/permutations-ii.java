class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> per = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(result,per,used,nums);
        return result;
    }
    public void backtrack(List<List<Integer>> result,List<Integer> per,boolean[] used ,int[] nums){
        if(per.size()==nums.length){
            
            result.add(new ArrayList<>(per));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if (used[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
            per.add(nums[i]);
            used[i]=true;
            backtrack(result,per,used,nums);
            per.remove(per.size()-1);
            used[i]=false;
        }
    }
}