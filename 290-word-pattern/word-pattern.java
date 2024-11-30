class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        Map<Character , String> patternmap = new HashMap<>();
        Map<String , Character> sMap = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(patternmap.containsKey(c)){
                if(!patternmap.get(c).equals(word)){
                    return false;
                }
            }
            else{
                patternmap.put(c,word);
            }

            if(sMap.containsKey(word)){
                if(!sMap.get(word).equals(c)){
                    return false;
                }
            }
            else{
                sMap.put(word,c);
            }
        }
        return true;
    }
}