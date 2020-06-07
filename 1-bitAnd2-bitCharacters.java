// We have two special characters. The first character can be represented by one bit 0.
// The second character can be represented by two bits (10 or 11).
// Now given a string represented by several bits. Return whether the last character must be a one-bit character or not.
// The given string will always end with a zero.

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        
        boolean check = true;
        for(int i = 1; i < bits.length; i++){
            int pre = bits[i - 1];
            if(check){
                if(bits[i] == 0 && pre == 0){
                    check = true;
                }else if(bits[i] == 0 && pre == 1){
                    check = false;
                }else if(bits[i] == 1 && pre == 1){
                    check = false;
                }
            }else{
                check = true;
            }
        }
        
        return check;
    }
}
