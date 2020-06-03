// Given an integer n. No-Zero integer is a positive integer which doesn't contain any 0 in its decimal representation.
// Return a list of two integers [A, B] where:
// A and B are No-Zero integers.
// A + B = n
// It's guarateed that there is at least one valid solution. If there are many valid solutions you can return any of them.

class Solution {
    public int[] getNoZeroIntegers(int n) {
        
        int[] result = new int[2];
        int temp = n;
        for(int i = 0; i < n; i++){
            temp = temp - i;
            String stri = Integer.toString(i);
            String strtemp = Integer.toString(temp);
            if(!stri.contains("0") && !strtemp.contains("0")){
                result[0] = i;
                result[1] = temp;
                break;
            }
            temp = n;
        }
        
        return result;
        
    }
}
