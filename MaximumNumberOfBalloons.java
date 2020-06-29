// Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
// You can use each character in text at most once. Return the maximum number of instances that can be formed.

class Solution {
    public int maxNumberOfBalloons(String text) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);
        
        for(int i = 0; i < text.length(); i++){
            if(map.containsKey(text.charAt(i))){
                int count = map.get(text.charAt(i));
                count++;
                map.put(text.charAt(i), count);
            }
        }
        
        int temp = 1;
        int result = 0;
        while(temp > 0){
            for (Map.Entry<Character, Integer> ele : map.entrySet()) { 
                int count = ele.getValue();
                if(ele.getKey() == 'b' || ele.getKey() == 'a' || ele.getKey() == 'n'){
                    count--;
                }else if(ele.getKey() == 'l' || ele.getKey() == 'o'){
                    count -= 2;
                }

                map.put(ele.getKey(), count);
                
                if(count < 0 ){
                    return result;
                }
                
                if(count < temp){
                    temp = count;
                }
            }
            result++;
        }
        
        return result;
    }
}
