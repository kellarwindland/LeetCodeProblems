// An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
// Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.

class Solution {
    fun checkValid(matrix: Array<IntArray>): Boolean {
             
        
        for (i in 0..matrix.size - 1) {
            val set1 = mutableSetOf<Int>()
            
            for (j in 0..matrix.size - 1) {   
                val num = matrix[j][i]
                if (set1.contains(num)) {
                    return false
                } else {
                    set1.add(num)
                }
            }
            
        }
        
        
        
        matrix.forEach {
            val set2 = mutableSetOf<Int>()
            
            it.forEach { second ->
                if (set2.contains(second)) {
                    return false
                } else {
                    set2.add(second)
                }
            }
        }
        
        return true
    }
}
