// Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
// A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        int size;
        
        if(matrix[0].length > matrix.length){
            size = matrix[0].length;
        }else{
            size = matrix.length;
        }
        
        int[] minArr = new int[size];
        int[] maxArr = new int[size];
        
        Arrays.fill(minArr, Integer.MAX_VALUE);
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                
                if(matrix[i][j] < minArr[i]){
                    minArr[i] = matrix[i][j];
                }
                
                if(matrix[i][j] > maxArr[j]){
                    maxArr[j] = matrix[i][j];
                }
            }
        }
    
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < minArr.length; i++){
            set.add(minArr[i]);
        }
        
        for(int i = 0; i < maxArr.length; i++){
            if(set.contains(maxArr[i])){
                result.add(maxArr[i]);
            }
        }
        
        return result;
    }
}
