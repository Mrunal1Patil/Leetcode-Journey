class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        Set<Integer> zerorow = new HashSet<>();
        Set<Integer> zerocol = new HashSet<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    zerorow.add(i);
                    zerocol.add(j);
                }
            }
        }
        for(int row: zerorow){
            for(int j=0;j<n;j++){
                matrix[row][j]=0;
            }
        }
         for(int col: zerocol){
            for(int i=0;i<m;i++){
                matrix[i][col]=0;
            }
        }


    }
}