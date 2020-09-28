// Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
// To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        
        int[][] result = new int[A.length][A[0].length];
        for(int i = 0; i < A.length; i++){
            int index = 0;
            for(int j = A[i].length - 1; j >= 0; j--){
                if(A[i][j] == 1){
                    result[i][index] = 0;
                }else{
                    result[i][index] = 1;
                }
                index++;
            }
        }
        
        return result;
    }
}
