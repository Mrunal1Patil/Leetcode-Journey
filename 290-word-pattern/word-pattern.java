class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(words.length!= pattern.length()) return false;

        HashMap<Character , String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char pchar = pattern.charAt(i);
            String sstring = words[i];

            if(map1.containsKey(pchar)){
                if(!map1.get(pchar).equals(sstring)){
                    return false;
                }
            }
            else{
                map1.put(pchar,sstring);
            }

            if(map2.containsKey(sstring)){
                if(!map2.get(sstring).equals(pchar)){
                    return false;
                }
            }
            else{
                map2.put(sstring,pchar);
            }
        }
        return true;
    }
}