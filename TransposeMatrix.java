// Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

class Solution {
    public int[][] transpose(int[][] matrix) {
     
        int[][] result = new int[matrix[0].length][matrix.length];
     
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                result[j][i] = matrix[i][j];
            }
        }
        
        return result;
    }
}
