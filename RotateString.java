// A shift on A consists of taking string A and moving the leftmost character to the rightmost position.
// For example, if A = 'abcde', then it will be 'bcdea' after one shift on A.
// Return True if and only if A can become B after some number of shifts on A.

class Solution {
    public boolean rotateString(String A, String B) {
        
        if(A.length() == 0 && B.length() == 0){
            return true;
        }
        
        boolean result = false;
        String holder = A;
        for(int i = 0; i < A.length(); i++){
            String temp = holder.substring(1);
            holder = temp + holder.charAt(0);
            if(holder.equals(B)){
                result = true;
                break;
            }
        }
        
        return result;
        
    }
}
