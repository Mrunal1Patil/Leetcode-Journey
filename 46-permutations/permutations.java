class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPermutations = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(nums, currentPermutations, result, used);
        return result;
    }

    public void backtrack(int[] nums, List<Integer> currentPermutations, List<List<Integer>> result, boolean[] used) {
        if (currentPermutations.size() == nums.length) {
            result.add(new ArrayList<>(currentPermutations));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            currentPermutations.add(nums[i]);
            backtrack(nums, currentPermutations, result, used);
            currentPermutations.remove(currentPermutations.size() - 1);
            used[i] = false;
        }
    }
}