// You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
// Grid cells are connected horizontally/vertically (not diagonally). 
// The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
// The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1.
// The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int result = 0;
        int[] prev = new int[grid[0].length];
        int pre = 0;
        for(int i = 0; i < grid.length; i++){
            int[] temp = grid[i];
            pre = 0;
            for(int j = 0; j < temp.length; j++){
                if(temp[j] == 1 && prev[j] == 0 && pre == 0){
                    result += 4;
                }else if (temp[j] == 1 && prev[j] == 1 && pre == 0){
                    result += 2;
                }else if(temp[j] == 1 && prev[j] == 0 && pre == 1){
                    result += 2;
                }
                pre = temp[j];
            }
            prev = grid[i];
        }
        
        return result;
        
    }
}
