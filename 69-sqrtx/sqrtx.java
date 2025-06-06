class Solution {
    public int mySqrt(int x) {
     
     int start = 2;
     int end = x/2;
        if(x<2){
            return x;
        }
     while(start<=end){
        int middle = start+(end-start)/2;
        long target = (long)middle * middle;
        if(target==x){
            return middle;
        }
        if(target<x){
            
            start = middle + 1;
        }
        else if(target>x){
            end = middle -1 ;
        }
     }
     return end;
    }
    }












