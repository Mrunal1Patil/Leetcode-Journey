public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
        HashMap<String, List<String>> map = new HashMap<>();

       for(String word : strs){
        char[] chars = word.toCharArray();

        Arrays.sort(chars);
        String sorted = new String(chars);

        List<String> anagrams = map.getOrDefault(sorted, new ArrayList<>());
     anagrams.add(word);
     map.put(sorted, anagrams);
       }
        return new ArrayList<>(map.values());
    }
}