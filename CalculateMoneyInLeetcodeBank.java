// Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
// He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday,
// he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
// Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.

class Solution {
    public int totalMoney(int n) {
        
        int result = 0;
        int week = 0;
        
        while(n >= 0){
            
            if(n >= 7){
                result += 28 + (7 * week);
            }else{
                for(int i = 1; i <= n; i++){
                    result += i + week;
                }
            }
            
            week++;
            n -= 7;
        }
        
        return result;
    }
}
