class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int total=0;
        int tank=0;
        
        for(int i=0;i<gas.length;i++){
            int balance = gas[i]-cost[i];
            total += balance;
            tank += balance;
            
            if(tank < 0){
                tank=0;
                start=i+1;
            }
        }
        
        return total>=0 ?start :-1; 
    
    }
}