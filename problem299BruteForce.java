// You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is.
// Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls")
// and how many digits match the secret number but locate in the wrong position
// (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.
// Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to indicate the cows. 
// Please note that both secret number and friend's guess may contain duplicate digits.

class Solution {
    public String getHint(String secret, String guess) {
        
        int bulls = 0;
        int cows = 0;
        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        HashSet<Character> set = new HashSet<Character>();
        
        for(int i = 0; i < secret.length(); i++){
            char tempC = secret.charAt(i);
            map.put(i, tempC);
            if(map2.containsKey(tempC)){
                int count = map2.get(tempC);
                count++;
                map2.put(tempC, count);
            }else{
                map2.put(tempC, 1);
            }
        }
        
        for(int i = 0; i < guess.length(); i++){
            char temp = guess.charAt(i);
            if(temp == map.get(i)){
                bulls++;
                int count = map2.get(temp) - 1;
                map2.put(temp, count);
            }
        }
        
        for(int i = 0; i < guess.length(); i++){
            char temp = guess.charAt(i);
            if(temp != map.get(i)){
                if(map.containsValue(temp) && map2.get(temp) > 0 ){
                    int count = map2.get(temp) - 1;
                    map2.put(temp, count);
                    cows++;
                    set.add(temp);
                }
            }
        }
        
        String result = bulls + "A" + cows +"B";
        return result;
    }
}
