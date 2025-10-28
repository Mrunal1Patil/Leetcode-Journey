class Solution {
    public boolean isPalindrome(String s) {
       
       String a = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

       int start = 0;
       int end = a.length()-1;

       while(start<end){
        if(a.charAt(start)!=a.charAt(end)){
            return false;
        }
        start++;
        end--;
       }
       return true;

    }
}