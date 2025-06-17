class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      
      HashMap<Character, Integer> map1 = new HashMap<>();
      HashMap<Character, Integer> map2 = new HashMap<>();

      for(char c : ransomNote.toCharArray()){
       map1.put(c,map1.getOrDefault(c,0)+1);
      }
      for(char c: magazine.toCharArray()){
        map2.put(c,map2.getOrDefault(c,0)+1);
      }

      for(char c : ransomNote.toCharArray()){
        if(map2.getOrDefault(c,0) < map1.get(c)){
            return false;
        }
      }
      return true;
    }
}