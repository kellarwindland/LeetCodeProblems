// Given a positive integer num, output its complement number.
// The complement strategy is to flip the bits of its binary representation.

class Solution {
    public int findComplement(int num) {
        
        int result = 0;
        StringBuilder temp = new StringBuilder();
        while(num != 0){
            temp.append(num % 2);
            num /= 2;
        }        
        result = 0;
        int exp = 0;
        for(int i = 0; i < temp.length(); i++){
            char index = temp.charAt(i);
            if(index == '1'){
                
            }else{
                result += Math.pow(2, exp);
            }
            exp++;
        }
        
        return result;
    }
}
