// Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        
        int last = map.get(s.charAt(0));
        
        int result = 0;
            
        for(int i = 0; i < s.length(); i++){
            
            char c = s.charAt(i);
            
            int temp = map.get(c);
            
            if(last < temp){
                result = result + (temp - (2 * last));
            }else{
                result = result + temp;
            }
            
            last = temp;
            
        }
        
        return result;
        
    }
}
