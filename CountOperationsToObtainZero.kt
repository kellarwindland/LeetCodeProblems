// You are given two non-negative integers num1 and num2.
// In one operation, if num1 >= num2, you must subtract num2 from num1, otherwise subtract num1 from num2.
// For example, if num1 = 5 and num2 = 4, subtract num2 from num1, thus obtaining num1 = 1 and num2 = 4. However, if num1 = 4 and num2 = 5, after one operation, num1 = 4 and num2 = 1.
// Return the number of operations required to make either num1 = 0 or num2 = 0.

class Solution {
    fun countOperations(num1: Int, num2: Int): Int {
        
        var temp1 = num1
        var temp2 = num2
        var count = 0
        
        while (temp1 != 0 && temp2 != 0) {
            if (temp1 >= temp2) {
                temp1 = temp1 - temp2
            } else {
                temp2 = temp2 - temp1
            }
            count++
        }
        
        return count
    }
}
