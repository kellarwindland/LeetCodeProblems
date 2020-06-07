// There are 2N people a company is planning to interview. 
// The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].
// Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int result = 0;
        int N = costs.length;
        
        int[] arr = new int[costs.length];
        for(int i = 0; i < costs.length; i++){
            arr[i] = costs[i][1] - costs[i][0];
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < costs.length; i++){
            result += costs[i][0];
        }
        
        for(int i = 0; i < arr.length / 2; i++){
            result += arr[i];
        }
        
        return result;
    }
}
