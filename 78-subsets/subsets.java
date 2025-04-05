class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(new ArrayList<>(), nums , 0 , result);
        return result;

    }
    private static void generateSubsets(List<Integer>processed , int[] unprocessed , int index , List<List<Integer>> result){

        if(index == unprocessed.length){
            result.add(new ArrayList<>(processed));
            return;
        }
        generateSubsets(processed, unprocessed, index + 1, result);
        processed.add(unprocessed[index]);
        generateSubsets(processed, unprocessed, index + 1, result);
          processed.remove(processed.size() - 1);
    }
   
}