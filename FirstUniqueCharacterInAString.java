// Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(map.containsKey(temp)){
                int count = map.get(temp);
                count++;
                map.put(temp, count);
            }else{
                map.put(temp, 1);
            }
        }
        
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(map.get(temp) == 1){
                return s.indexOf(temp);
            }
        }
        
        return -1;
    }
}
