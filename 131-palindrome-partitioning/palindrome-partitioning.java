class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
        helper(result, current, s,0);
        return result;
    }

    public void helper(List<List<String>> result,List<String> current,String s, int index){

        if(index==s.length()){
            result.add(new ArrayList<>(current));
        }

        for(int i=index;i<s.length();i++){
            String subs = s.substring(index,i+1);
            if(palindrome(subs)){
                current.add(subs);
                helper(result,current,s,i+1);
                current.remove(current.size()-1);
            }

        }
    }

    private boolean palindrome(String str){
        int start=0;
        int end = str.length()-1;

        while(start<end){
            if(str.charAt(start++)!=str.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}