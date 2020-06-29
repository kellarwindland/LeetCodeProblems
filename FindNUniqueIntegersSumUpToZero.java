// Given an integer n, return any array containing n unique integers such that they add up to 0.

class Solution {
    public int[] sumZero(int n) {
        
        int[] result = new int[n];
        int count = 1;
        
        if(n == 1){
            result[0] = 0;
            return result;
        }
        
        if(n % 2 == 0){
            for(int i = 0; i < n; i += 2){
                result[i] = count;
                result[i + 1] = -1 * count;
                count++;
            }
        }else{
            for(int i = 1; i < n; i += 2){
                result[i] = count;
                result[i + 1] = -1 * count;
                count++;
            }
            result[0] = 0;
        }
        
        return result;
    }
}
