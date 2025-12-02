class Solution {
  public boolean isPerfectSquare(int num) {
    
    if(num<=2) return true;
    int start = 2;
    int end = num /2;
    long number;

    while(start<=end ){
        int middle = start + (end -start) / 2;

        number = (long) middle * middle;
        if(number == num) return true;
        else if(number<num) start = middle + 1;
        else end = middle -1 ;
    }
    return false;
  }
}