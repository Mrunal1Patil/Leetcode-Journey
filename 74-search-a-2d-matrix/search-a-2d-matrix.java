class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m*n-1;

        while(start<=end){
            int middle = start + (end - start) / 2;
            int midvalue = matrix[middle/n][middle%n]; 
            if(midvalue == target){
                return true;
            }
            if(midvalue<target){
                start = middle +1;
            }
            else{
                end= middle-1;
            }

        }
        return false;
    }
}