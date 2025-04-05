class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;
        int startindex=0;
        int currenttank=0;


        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        if(totalgas<totalcost){
            return -1;
        }
        for(int i=0;i<gas.length;i++){
            currenttank = currenttank + gas[i] - cost[i];
            if(currenttank<0){
                startindex=i+1;
                currenttank=0;
            }
        }
        
        return startindex;
    }
}