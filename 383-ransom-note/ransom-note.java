class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character , Integer> ransommap = new HashMap<>();
        Map<Character , Integer> magmap = new HashMap<>();

        for(char c : ransomNote.toCharArray()){
            ransommap.put(c,ransommap.getOrDefault(c,0)+1);
        }
        for(char c: magazine.toCharArray()){
            magmap.put(c, magmap.getOrDefault(c,0)+1);
        }
        for(char c : ransomNote.toCharArray()){
            if(magmap.getOrDefault(c,0) < ransommap.get(c)){
                return false;
            }
        }
        return true;
    }
}