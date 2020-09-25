// In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there.
// We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings).
// Height 0 is considered to be a building as well. 
// At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right, must be the same as the skyline of the original grid.
// A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance. See the following example.
// What is the maximum total sum that the height of the buildings can be increased?

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int[] maxTB = new int[grid.length];
        int[] maxLR = new int[grid.length];
        
        for(int i = 0; i < grid.length; i++){
            int[] temp = grid[i];
            for(int j = 0; j < temp.length; j++){
                if(temp[j] > maxTB[j]){
                    maxTB[j] = temp[j];
                }
                
                if(temp[j] > maxLR[i]){
                    maxLR[i] = temp[j];
                }
            }
        }
        
        int result = 0;
        for(int i = 0; i < grid.length; i++){
            int[] temp = grid[i];
            for(int j = 0; j < temp.length; j++){
                int check = maxTB[j];
                if(check > maxLR[i]){
                    check = maxLR[i];
                }
                
                result += (check - temp[j]);
            }
        }
        
        return result;
    }
}
