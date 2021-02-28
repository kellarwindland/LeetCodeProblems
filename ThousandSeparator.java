// Given an integer n, add a dot (".") as the thousands separator and return it in string format.

class Solution {
    public String thousandSeparator(int n) {
        String result = "";
        int count = 0;
        
        if(n == 0){
            return "0";
        }
        
        while(n > 0){
            int temp = n % 10;
            n = n / 10;
            result = temp + result;
            if(count == 2 && n > 0){
                result = "." + result;
                count = -1;
            }
            count++;
        }
        
        return result;
    }
}
