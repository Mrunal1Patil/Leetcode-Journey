class Solution {
    public int mySqrt(int x) {
      
      int start =2;
      int end = x/2;
        long num;
        if(x<2){
            return x;
        }
      while(start<=end){
        int middle = start + (end-start) / 2;
         num = (long)middle*middle;
        if(num==x){
            return middle;
        }
        else if(num>x){
            end=middle-1;
        }
        else{
            start=middle+1;
        }
        
    }
    return end;
    }
    }












