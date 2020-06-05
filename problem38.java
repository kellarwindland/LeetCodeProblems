// The count-and-say sequence is the sequence of integers with the first five terms as following:
// 1.     1
// 2.     11
// 3.     21
// 4.     1211
// 5.     111221
// 1 is read off as "one 1" or 11.
// 11 is read off as "two 1s" or 21.
// 21 is read off as "one 2, then one 1" or 1211.
// Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence. 
// You can do so recursively, in other words from the previous member read off the digits, counting the number of digits in groups of the same digit.

class Solution {
    public String countAndSay(int n) {
        
        String result = "";
        if(n > 1){
            String temp = countAndSay(n - 1);
            char pre = temp.charAt(0);
            int count = 0;
            for(int i = 0; i < temp.length(); i++){
                char tempC = temp.charAt(i);
                if(tempC == pre){
                    count++;
                }else{
                    result += Integer.toString(count) + pre;
                    count = 1;
                }
                pre = tempC;
            }
            result += Integer.toString(count) + pre;   
        }else{
            result = "1";
        }
        return result;
    }
}
