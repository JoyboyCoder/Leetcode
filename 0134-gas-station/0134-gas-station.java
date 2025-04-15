class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sGas = 0, sCost = 0, station = 0, total = 0;
        for(int i=0;i<gas.length;i++){
            sGas+=gas[i];
            sCost+=cost[i];
        }
        if(sGas<sCost) return -1;
        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            if(total<0){
                total=0;
                station = i+1;
            }
        }
        return station;
    }
}