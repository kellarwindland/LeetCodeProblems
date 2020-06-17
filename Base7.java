// Given an integer, return its base 7 string representation.

class Solution {
    public String convertToBase7(int num) {
        
        String result = "";
        boolean neg = false;
        if(num == 0){
            result = "0";
        }else if(num < 0){
            neg = true;
            num *= -1;
        }
        
        while(num != 0){
            int rem = num % 7;
            result = rem + result;
            num /= 7;
        }
        
        if(neg){
            result = "-" + result;
        }
        
        return result;
    }
}
