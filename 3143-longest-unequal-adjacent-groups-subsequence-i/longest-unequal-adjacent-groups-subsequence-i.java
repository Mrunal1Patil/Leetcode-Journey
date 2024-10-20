class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
         List<Integer> indices = new ArrayList<>();
        int n = groups.length;

        indices.add(0);

        for (int i = 1; i < n; i++) {
           
            if (groups[i] != groups[indices.get(indices.size() - 1)]) {
                indices.add(i);
            }
        }
        List<String> result = new ArrayList<>();
        for (int index : indices) {
            result.add(words[index]);
        }

        return result;
    }
}