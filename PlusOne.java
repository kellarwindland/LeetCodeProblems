// Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
// You may assume the integer does not contain any leading zero, except the number 0 itself.

class Solution {
    public int[] plusOne(int[] digits) {
        
        int len = digits.length;
        List<Integer> result = new ArrayList<>();
        boolean carry = true;
        
        for(int i = len - 1; i >= 0; i--){
            
            int temp = digits[i];
            
            if(temp == 9 && carry){
                temp = 0;                
                carry = true;
            }else{
                if(carry){
                    temp++;
                    carry = false;
                }
            }
            
            result.add(temp);
                        
        }
        
        
        
        if(carry){
            result.add(1);       
        }
        
        Collections.reverse(result);
        
        int[] temp = new int[result.size()];
        
        int i = 0;
        for (int n: result) {
            temp[i] = n;
            i++;
        } 

        
        return temp;
        
    }
}
