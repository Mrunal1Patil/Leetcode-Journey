class Solution {
    int empty = Integer.MAX_VALUE;
    int gate =0;
    int wall =-1;
    int[] rowdirections = {-1 ,1 , 0 , 0};
    int[] coldirections = {0 ,0 ,-1 , 1};

    public void wallsAndGates(int[][] rooms) {
        if(rooms==null || rooms.length==0){
            return;
        }
        int m = rooms.length;
        int n = rooms[0].length;
        Queue<int[]> queue = new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rooms[i][j]==gate){
                    queue.offer(new int[] {i,j});
                }
            }
        } 

        while(!queue.isEmpty()){
            int[] point = queue.poll();
            int row = point[0];
            int col = point[1];
            for(int i=0;i<4;i++){
                int newrow = row + rowdirections[i];
                int newcol = col + coldirections[i];

                if(newrow<0 || newrow>=m || newcol<0||newcol>=n|| rooms[newrow][newcol]!=empty){
                    continue;
                }
                rooms[newrow][newcol] = rooms[row][col]+1;
                queue.offer(new int[]{newrow,newcol});
            }
        }
    }
}