// Given a m * n matrix grid which is sorted in non-increasing order both row-wise and column-wise. 

class Solution {
    public int countNegatives(int[][] grid) {
        
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            
            int[] temp = grid[i];
            for(int j = 0; j < temp.length; j++){
                if(temp[j] < 0){
                    count++;
                }
            }
            
        }
        
        return count;
    }
}
