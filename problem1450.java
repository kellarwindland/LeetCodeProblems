class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        
        int len = startTime.length;
        int total = 0;
        
        for(int i = 0; i < len; i++){
                if(queryTime >= startTime[i] && queryTime <= endTime[i]){
                    total++;
                }
        }
        
        return total;
    }
}
