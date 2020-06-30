// Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a==c and b==d), or (a==d and b==c) - that is,
// one domino can be rotated to be equal to another domino.
// Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        
        for(int i = 0; i < dominoes.length; i++){
            int[] temp = dominoes[i];
            Arrays.sort(temp);
            dominoes[i] = temp;
        }
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i < dominoes.length; i++){
            String str = "" + dominoes[i][0] + dominoes[i][1];
            if(map.containsKey(str)){
                int count = map.get(str);
                count++;
                map.put(str, count); 
            }else{;
                map.put(str, 1); 
            }
        }
        System.out.println(map.toString());
        int result = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1){
                result += ((entry.getValue() * (entry.getValue() + 1)) / 2) - entry.getValue();   
            }
        }   
        
        return result;
    }
}
