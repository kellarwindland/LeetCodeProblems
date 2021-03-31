// Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

class Solution {
    public boolean hasAlternatingBits(int n) {
        
        String s = Integer.toBinaryString(n);
        
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                if(s.charAt(i) != '1'){
                    return false;
                }
            }else{
                if(s.charAt(i) != '0'){
                    return false;
                }
            }
        }
        
        return true;    
    }
}
